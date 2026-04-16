package sample.common.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sample.common.dao.entity.Login;
import sample.common.dao.mapper.LoginMapper;

@Repository // このクラスがDBアクセスを担当することを示す魔法
public class LoginDao {

    @Autowired
    private LoginMapper loginMapper; // 倉庫番（Mapper）を呼び出す

    /**
     * ユーザー名とパスワードを元にユーザー情報を1件取得する
     */
    public Login findUser(String username, String password) {
        // Mapper（XMLのSQL）を呼び出して結果を返す
        return loginMapper.findByUsernameAndPassword(username, password);
    }
    
    /**
     * 新しいユーザーを登録する
     */
    public int insertUser(String username, String password) {
        // Mapper（倉庫番）にお願いして、DBに保存してもらう
        return loginMapper.insert(username, password);
    }
}