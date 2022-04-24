package com.ibm.dao;

// import java.util.ArrayList;
import java.util.List;

import com.ibm.bean.User;

import org.springframework.stereotype.Repository;
@Repository
public class UserImpl implements UserDAO {

    private static List<User> users;
    
    @Override
    public List<User> list() {
        //List all users
        return users;
    }

    @Override
    public User get(long id) {
        // get info of particular user
        
        return null;
    }

    @Override
    public User create(User user) {
        // create new user
        return null;
    }

    @Override
    public User update(Long id, User user) {
        // Update student info

           
        return null;
    }

    @Override
    public Long delete(Long id) {
        // delete student info
        
        return null;
    }

}
