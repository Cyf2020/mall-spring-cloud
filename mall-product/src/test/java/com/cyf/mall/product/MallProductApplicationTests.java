package com.cyf.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cyf.mall.product.entity.BrandEntity;
import com.cyf.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {
        List<BrandEntity> brandId = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        brandId.forEach(System.out::println);
    }
}
