package com.xiaoming.gulimall.coupon.dao;

import com.xiaoming.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author xiaoming
 * @email shixiaomingye@gmail.com
 * @date 2020-04-02 15:51:49
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
