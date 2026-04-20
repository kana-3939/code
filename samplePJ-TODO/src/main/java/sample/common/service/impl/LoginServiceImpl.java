package sample.common.service.impl;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sample.common.dao.entity.Login;
import sample.common.dao.mapper.LoginMapper;
import sample.common.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper; // これ一つに統一！

    @Override
    public Login authenticate(String username, String password) {
        Login user = loginMapper.findByUsername(username);
        if (user != null) {
            String inputHashed = hashPassword(password);
            if (user.getPassword().equals(inputHashed)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public boolean registerUser(String username, String password) {
        String hashed = hashPassword(password);
        return loginMapper.insertUser(username, hashed) > 0;
    }

    // ハッシュ化メソッド（SHA-256）
    private String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(password.getBytes(StandardCharsets.UTF_8));
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}