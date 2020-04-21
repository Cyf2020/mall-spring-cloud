package com.cyf.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cyf.common.utils.PageUtils;
import com.cyf.mall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author Cyf
 * @email cyf1589247013@gmail.com
 * @date 2020-04-21 22:46:01
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

