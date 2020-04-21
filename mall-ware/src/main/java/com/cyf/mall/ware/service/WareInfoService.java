package com.cyf.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cyf.common.utils.PageUtils;
import com.cyf.mall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author Cyf
 * @email cyf1589247013@gmail.com
 * @date 2020-04-21 23:20:40
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

