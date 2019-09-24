package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.user.bean.UmsMember;

import java.util.List;

/**
 * @auther Bao
 * @date 2019/9/24 15:06
 */
public interface UserMapper {
    List<UmsMember> selectAllUser();
}
