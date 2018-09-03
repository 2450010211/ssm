package com.lhf.ssm.service.impl;

import com.lhf.ssm.bean.TUser;
import com.lhf.ssm.dao.TUserMapper;
import com.lhf.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shkstart
 * @create 2018-09-03 8:59
 */
@Service
public class UserServiceImpl  implements UserService{

    @Autowired
    TUserMapper userMapper;

    @Override
    public List<TUser> getUsers() {
        return userMapper.selectByExample(null);
    }
}
