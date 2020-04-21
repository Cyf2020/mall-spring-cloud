package com.cyf.mall.ware.dao;

import com.cyf.mall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author Cyf
 * @email cyf1589247013@gmail.com
 * @date 2020-04-21 23:20:40
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
