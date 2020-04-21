package com.cyf.mall.product.dao;

import com.cyf.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Cyf
 * @email cyf1589247013@gmail.com
 * @date 2020-04-21 19:37:53
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
