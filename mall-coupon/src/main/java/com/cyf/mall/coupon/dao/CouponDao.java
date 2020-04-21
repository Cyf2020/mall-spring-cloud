package com.cyf.mall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cyf.mall.coupon.entity.CouponEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author Cyf
 * @email cyf1589247013@gmail.com
 * @date 2020-04-21 22:19:41
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
