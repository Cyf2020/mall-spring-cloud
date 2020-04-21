package com.cyf.mall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cyf.common.utils.PageUtils;
import com.cyf.common.utils.Query;
import com.cyf.mall.coupon.dao.HomeAdvDao;
import com.cyf.mall.coupon.entity.HomeAdvEntity;
import com.cyf.mall.coupon.service.HomeAdvService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("homeAdvService")
public class HomeAdvServiceImpl extends ServiceImpl<HomeAdvDao, HomeAdvEntity> implements HomeAdvService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HomeAdvEntity> page = this.page(
                new Query<HomeAdvEntity>().getPage(params),
                new QueryWrapper<HomeAdvEntity>()
        );

        return new PageUtils(page);
    }

}