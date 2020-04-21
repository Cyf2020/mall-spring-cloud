package com.cyf.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cyf.common.utils.PageUtils;
import com.cyf.mall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author Cyf
 * @email cyf1589247013@gmail.com
 * @date 2020-04-21 22:19:42
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

