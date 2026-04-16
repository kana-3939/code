package sample.common.service;

import sample.common.dao.entity.Login;

public interface LoginService {
    // ユーザー名とパスワードでユーザーを探す
    Login authenticate(String username, String password);

    boolean registerUser(String username, String password);

}