package com.xiaoming.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoming.common.utils.PageUtils;
import com.xiaoming.gulimall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author xiaoming
 * @email shixiaomingye@gmail.com
 * @date 2020-04-02 15:34:48
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

