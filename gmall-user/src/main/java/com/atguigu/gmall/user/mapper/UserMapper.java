package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.api.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @auther Bao
 * @date 2019/9/24 15:06
 */
public interface UserMapper extends Mapper<UmsMember> {
    List<UmsMember> selectAllUser();
}
