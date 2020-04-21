package com.cyf.mall.order.dao;

import com.cyf.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Cyf
 * @email cyf1589247013@gmail.com
 * @date 2020-04-21 23:15:43
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
