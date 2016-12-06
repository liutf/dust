package com.dust.powermock;

import com.google.common.base.Preconditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liutf on 2016-10-12.
 */
@Service
public class UserController {

    @Autowired
    private UserService userService;

    public String getUserInfo(int id){
        UserBean userBean = userService.getUserById(id);
        System.out.println(userBean);

        return userBean.toString();
    }

    public boolean userCancelAcct(int id){
        UserBean userBean = userService.getUserById(id);

        Preconditions.checkNotNull(userBean);

        return userService.delUserById(userBean.getId());
    }

}
