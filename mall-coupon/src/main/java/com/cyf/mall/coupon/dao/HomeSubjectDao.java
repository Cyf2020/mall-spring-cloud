package com.cyf.mall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cyf.mall.coupon.entity.HomeSubjectEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 * 
 * @author Cyf
 * @email cyf1589247013@gmail.com
 * @date 2020-04-21 22:19:41
 */
@Mapper
public interface HomeSubjectDao extends BaseMapper<HomeSubjectEntity> {
	
}
