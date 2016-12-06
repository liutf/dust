package com.dust.mock.powermock;

import com.dust.DustApplicationTests;
import com.dust.powermock.UserController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * Created by liutf on 2016-10-12.
 */

@RunWith(PowerMockRunner.class)
public class PowerMockTest extends DustApplicationTests{

//    @Mock
    @InjectMocks
    UserController userController;


    @Test
    public void helloMockTest(){

        PowerMockito.when(userController.getUserInfo(11)).thenReturn("hello mock.");

        Assert.assertEquals("hello mock.",userController.getUserInfo(1));

    }

    @Test
    public void userCancelAcctTest(){

        PowerMockito.when(userController.userCancelAcct(Matchers.anyInt())).thenCallRealMethod();

        boolean result = userController.userCancelAcct(1);

        Assert.assertEquals(Boolean.TRUE,result);

    }


}
