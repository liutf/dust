package com.dust.powermock;

/**
 * Created by liutf on 2016-10-12.
 */
public interface UserService {

    public UserBean getUserById(int id);

    public void saveUser(UserBean userBean);

    public boolean delUserById(int id);

}
