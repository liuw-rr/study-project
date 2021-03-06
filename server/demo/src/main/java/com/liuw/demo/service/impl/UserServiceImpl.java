package com.liuw.demo.service.impl;


import com.liuw.demo.db.domain.User;
import com.liuw.demo.db.mapper.UserMapper;
import com.liuw.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liuw
 * @date 2020-05-23 3:26
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
