package com.atguigu.gmall.user.service.impl;


import com.atguigu.gmall.api.bean.UmsMember;
import com.atguigu.gmall.api.service.UserService;
import com.atguigu.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther Bao
 * @date 2019/9/24 15:02
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userMapper.selectAll();
        return umsMembers;
    }


}
