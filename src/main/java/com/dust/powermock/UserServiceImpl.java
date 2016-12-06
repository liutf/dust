package com.dust.powermock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liutf on 2016-10-12.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;
    //    private UserDAO userDAO = new UserDAOImpl();

    @Override
    public UserBean getUserById(int id) {
        return userDAO.getUserById(id);
    }

    @Override
    public void saveUser(UserBean userBean) {
        userDAO.saveUser(userBean);
    }

    @Override
    public boolean delUserById(int id) {
        return userDAO.delUserById(id);
    }
}
