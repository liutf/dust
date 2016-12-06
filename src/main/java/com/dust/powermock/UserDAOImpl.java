package com.dust.powermock;

import org.springframework.stereotype.Service;

/**
 * Created by liutf on 2016-10-12.
 */
@Service
public class UserDAOImpl implements UserDAO {

    @Override
    public UserBean getUserById(int id) {
        UserBean userBean = null;
        if(id == 888){
            userBean = new UserBean();
            userBean.setId(id);
            userBean.setName("name - " + id);
            userBean.setPassword("pwd@" + id);
            System.out.println(userBean.toString());
        }
        return userBean;
    }

    @Override
    public boolean saveUser(UserBean userBean) {
        boolean rs;
        if(userBean.getId() <= 0){
            System.out.println("saved..");
            rs = true;
        }else{
            System.out.println("moded..");
            rs = true;
        }
        return rs;
    }

    @Override
    public boolean delUserById(int id) {
        boolean rs = false;
        if(id > 0){
            System.out.println("deleted ..");
            rs = true;
        }else{
            System.out.println("delete failure..");
        }
        return rs;
    }
}
