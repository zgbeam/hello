package com.example.hello.service;

import com.example.hello.mapper.UserMapper;
import com.example.hello.model.UserExample;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author smile
 */
@Service
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
