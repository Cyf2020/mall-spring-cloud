package com.cyf.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cyf.common.utils.PageUtils;
import com.cyf.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author Cyf
 * @email cyf1589247013@gmail.com
 * @date 2020-04-21 19:37:53
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

