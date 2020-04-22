package com.cyf.mall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * description:
 * <p>nacos-feign远程调用别的服务</p>
 * <ol>
 *     <li>引入open-feign</li>
 *     <li>编写一个接口,告诉springCloud这个接口需要调用远程服务</li>
 * </ol>
 * @see com.cyf.mall.member.feign.CouponFeignService
 * @author Cyf丶
 * @since 2020/4/22 0:24
 */

/**
 * description:
 * <h2>nacos-config动态修改配置文件</h2>
 * <h3>(一)使用</h3>
 * <ol>
 *     <li>引入nacos-config</li>
 *     <li>创建bootstrap.properties,加入配置文件spring.application.name=mall-member和spring.cloud.nacos.config.server-addr=127.0.0.1:8848</li>
 *     <li>给配置中心添加当前name.properties的数据集:如mall-member.properties</li>
 *     <li>使用区域上添加@RefreshScope启用</li>
 *     <li>若配置中心和配置文件同时有,优先配置中心</li>
 * </ol>
 * <h3>(二)更多细节</h3>
 * <ol>
 *     <li>命名空间</li>
 *     <p>默认:public(保留空间),默认所有新增的配置都在public空间,主要用于开发环境/生产环境/测试环境的隔离或者不同微服务之间的隔离</p>
 *     <p>需要配置:spring.cloud.nacos.config.namespace=xxx</p>
 *     <li>配置集</li>
 *     <p>所以配置的集合</p>
 *     <li>配置集id</li>
 *     <p>类似于配置文件名</p>
 *     <li>配置分组</li>
 *     <p>默认所有配置集都属于DEFAULT_GROUP,在不同需求场景使用不同配置分组,比如双十一使用一组,日常使用另一组</p>
 * </ol>
 * @see com.cyf.mall.member.controller.MemberController
 * @author Cyf丶
 * @since 2020/4/22 1:56
 */





@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class MallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallMemberApplication.class, args);
    }

}
