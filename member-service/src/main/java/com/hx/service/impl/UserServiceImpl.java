package com.hx.service.impl;

import com.hx.dao.TfSysUserDao;
import com.hx.entity.User;
import com.hx.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private TfSysUserDao userDao;
    @Override
    public User getUser(User user) {
        return null;
    }

    @Override
    public int insert(User record) {
        return 0;
    }

    @Override
    public int insertSelective(User record) {
        return 0;
    }

    @Override
    public User selectById(User record) {
        return userDao.selectById(record);
    }
}
