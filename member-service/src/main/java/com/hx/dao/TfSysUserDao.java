package com.hx.dao;

import com.hx.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public interface TfSysUserDao {
    int insert(User record);

    int insertSelective(User record);
    User selectById(User record);
}