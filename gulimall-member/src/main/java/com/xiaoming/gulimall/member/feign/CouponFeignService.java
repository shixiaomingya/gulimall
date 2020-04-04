package com.xiaoming.gulimall.member.feign;

import com.xiaoming.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimall-coupon") // 调用配置中心中配置好的服务
public interface CouponFeignService {

    // 我们远程调用gulimall-coupon服务中的哪个方法,然后在去controller中调用这个方法,就会自动进行远程调用
    @RequestMapping("/coupon/coupon/test/list") // 路径需要写全,不然访问不到,前面需要加/
    public R membercoupons();

}
