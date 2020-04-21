package com.cyf.mall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cyf.common.utils.PageUtils;
import com.cyf.common.utils.Query;
import com.cyf.mall.coupon.dao.SeckillSkuNoticeDao;
import com.cyf.mall.coupon.service.SeckillSkuNoticeService;
import com.cyf.mall.coupon.entity.SeckillSkuNoticeEntity;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("seckillSkuNoticeService")
public class SeckillSkuNoticeServiceImpl extends ServiceImpl<SeckillSkuNoticeDao, SeckillSkuNoticeEntity> implements SeckillSkuNoticeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SeckillSkuNoticeEntity> page = this.page(
                new Query<SeckillSkuNoticeEntity>().getPage(params),
                new QueryWrapper<SeckillSkuNoticeEntity>()
        );

        return new PageUtils(page);
    }

}