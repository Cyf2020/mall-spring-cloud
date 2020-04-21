package com.cyf.mall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cyf.mall.coupon.entity.SeckillSkuRelationEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动商品关联
 * 
 * @author Cyf
 * @email cyf1589247013@gmail.com
 * @date 2020-04-21 22:19:42
 */
@Mapper
public interface SeckillSkuRelationDao extends BaseMapper<SeckillSkuRelationEntity> {
	
}
