package com.xiaoming.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoming.common.utils.PageUtils;
import com.xiaoming.gulimall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author xiaoming
 * @email shixiaomingye@gmail.com
 * @date 2020-04-02 15:51:49
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

