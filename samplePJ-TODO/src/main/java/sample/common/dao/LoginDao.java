package sample.common.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sample.common.dao.entity.Login;
import sample.common.dao.mapper.LoginMapper;

@Repository
public class LoginDao {
    @Autowired
    private LoginMapper loginMapper;

    public Login findByUsername(String username) {
        return loginMapper.findByUsername(username);
    }
    
    public int insertUser(String username, String hashedPassword) {
        return loginMapper.insert(username, hashedPassword);
    }
}