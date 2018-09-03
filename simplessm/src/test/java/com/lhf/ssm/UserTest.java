package com.lhf.ssm;

import com.lhf.ssm.bean.TUser;
import com.lhf.ssm.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author shkstart
 * @create 2018-09-03 10:15
 */
@ContextConfiguration(locations = "classpath:spring-mybatis.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserTest {

    @Autowired
    UserService userService;

    @Test
    public void userTest(){
        List<TUser> users = userService.getUsers();
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getUsername().length());
        }
    }
}
