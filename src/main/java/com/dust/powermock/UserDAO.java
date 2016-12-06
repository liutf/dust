package com.dust.powermock;

/**
 * Created by liutf on 2016-10-12.
 */
public interface UserDAO {

    public UserBean getUserById(int id);

    public boolean saveUser(UserBean userBean);

    public boolean delUserById(int id);

}
