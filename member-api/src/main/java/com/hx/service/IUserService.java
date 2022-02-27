package com.hx.service;

import com.hx.entity.User;

public interface IUserService {
    User getUser(User user);
    int insert(User record);

    int insertSelective(User record);
    User selectById(User record);
}
