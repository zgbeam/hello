package com.hello.service;

import com.hello.mapper.UserMapper;
import com.hello.model.UserExample;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author smile
 */
@DubboService
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Long hello() {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdEqualTo(0L);
        return userMapper.countByExample(userExample);
    }
}
