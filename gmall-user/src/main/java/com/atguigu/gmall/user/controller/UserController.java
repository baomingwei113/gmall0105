package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.service.UmsMemberReceiveAddressService;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @auther Bao
 * @date 2019/9/24 14:43
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UmsMemberReceiveAddressService umsMemberReceiveAddressService;

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "hello user";
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMember = userService.getAllUser();
        return umsMember;
    }
    @RequestMapping(value = "getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId( String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddresses;
    }


}
