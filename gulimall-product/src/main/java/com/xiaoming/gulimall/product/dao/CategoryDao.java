package com.xiaoming.gulimall.product.dao;

import com.xiaoming.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xiaoming
 * @email shixiaomingye@gmail.com
 * @date 2020-04-02 15:34:48
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
