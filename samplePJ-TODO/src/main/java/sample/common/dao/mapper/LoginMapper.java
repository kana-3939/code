package sample.common.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import sample.common.dao.entity.Login;

@Mapper
public interface LoginMapper {
    // ユーザー名だけで取得（パスワードはJavaで比較するため引数なし）
    Login findByUsername(@Param("username") String username);

    // ハッシュ化済パスワードを登録
    int insertUser(@Param("username") String username, @Param("password") String password);
}