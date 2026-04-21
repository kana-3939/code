package sample.common.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sample.common.dao.LoginDao;
import sample.common.dao.entity.Login;
import sample.common.service.LoginService;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao loginDao;

    // ソルトの長さ
    private static final int SALT_LENGTH = 16;
    // ハッシュ化の繰り返し回数（ストレッチング）
    private static final int ITERATIONS = 10000;

    @Override
    public Login authenticate(String username, String password) {
        Login user = loginDao.findByUsername(username);
        if (user == null) return null;

        // DBに保存されているハッシュ値とソルトを分離（ここでは単純化のため"ソルト:ハッシュ"の形式と仮定）
        String[] stored = user.getPassword().split(":");
        String salt = stored[0];
        String hash = stored[1];

        // 入力パスワードを同じ条件でハッシュ化して比較
        String hashedInput = hashPassword(password, salt);
        return hash.equals(hashedInput) ? user : null;
    }

    @Override
    public boolean registerUser(String username, String password) {
        String salt = generateSalt();
        String hashedPassword = hashPassword(password, salt);
        // "ソルト:ハッシュ" の形式で保存
        return loginDao.insertUser(username, salt + ":" + hashedPassword) > 0;
    }

    // パスワードをハッシュ化する共通ロジック
    private String hashPassword(String password, String salt) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(Base64.getDecoder().decode(salt));
            byte[] hashedBytes = password.getBytes();
            for (int i = 0; i < ITERATIONS; i++) {
                hashedBytes = md.digest(hashedBytes);
            }
            return Base64.getEncoder().encodeToString(hashedBytes);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    // ソルト生成
    private String generateSalt() {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[SALT_LENGTH];
        random.nextBytes(salt);
        return Base64.getEncoder().encodeToString(salt);
    }
}