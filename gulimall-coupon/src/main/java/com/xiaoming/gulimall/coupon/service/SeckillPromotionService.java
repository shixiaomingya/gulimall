package com.xiaoming.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoming.common.utils.PageUtils;
import com.xiaoming.gulimall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author xiaoming
 * @email shixiaomingye@gmail.com
 * @date 2020-04-02 15:51:48
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

