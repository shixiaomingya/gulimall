package com.xiaoming.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoming.common.utils.PageUtils;
import com.xiaoming.gulimall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author xiaoming
 * @email shixiaomingye@gmail.com
 * @date 2020-04-02 15:55:54
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

