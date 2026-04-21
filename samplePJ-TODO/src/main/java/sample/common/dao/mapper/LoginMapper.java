package sample.common.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import sample.common.dao.entity.Login;

@Mapper
public interface LoginMapper {
    // パスワードによる絞り込みを削除
    Login findByUsername(@Param("username") String username);

    // 引数名をハッシュ化を意識したものに変更
    int insert(@Param("username") String username, @Param("password") String hashedPassword);
}