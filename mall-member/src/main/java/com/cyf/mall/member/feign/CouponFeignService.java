package com.cyf.mall.member.feign;

import com.cyf.common.utils.R;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Cyf丶
 * @since 2020-04-22-0:27
 */
@EnableFeignClients(basePackages = "com.cyf.mall.member.feign")
@FeignClient("mall-coupon")
public interface CouponFeignService {
    /**
     * description:
     * <p>调用远程服务的方法</p>
     * <ol>
     *     <li>这里需要写完整地址</li>
     *     <li>写上定义的方法</li>
     *     <li>在程序入口也开启Feign扫描</li>
     *     <li>@FeignClient("cloud-name")注解</li>
     *     <li>@EnableFeignClients(basePackages = "com.cyf.mall.member.feign")开启服务</li>
     * </ol>
     * @see com.cyf.mall.member.controller.MemberController
     * @return com.cyf.common.utils.R
     * @author Cyf丶
     * @since 2020/4/22 0:31
     */
    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}
