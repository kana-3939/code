package sample.common.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sample.common.dao.LoginDao;
import sample.common.dao.entity.Login;
import sample.common.service.LoginService;

/**
 * ログインおよびユーザー管理に関する業務ロジックを実装するクラス
 */
@Service // Spring Bootに「これがServiceクラスですよ」と教える
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao loginDao; // DB操作の仲介役であるDaoを呼び出す

    /**
     * ログイン認証
     */
    @Override
    public Login authenticate(String username, String password) {
        // Dao経由で、ユーザー名とパスワードが一致するデータを探す
        return loginDao.findUser(username, password);
    }

    /**
     * 【新規追加】ユーザー登録処理
     */
    @Override
    public boolean registerUser(String username, String password) {
        // 1. まずは「同じユーザー名」が既に登録されていないかチェック
        // (本来はここで重複チェックを入れるのがプロの技ですが、まずはシンプルに保存へ進みます)
        
        // 2. Daoにお願いして、INSERT文を実行してもらう
        // 戻り値(int)は、DBに保存された行数（成功なら1）が返ってきます
        int result = loginDao.insertUser(username, password);
        
        // 3. 1行以上保存できていれば「成功(true)」を返す
        return result > 0;
    }
}