package com.atguigu.gmall.api.service;


import com.atguigu.gmall.api.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UmsMemberReceiveAddressService {
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
