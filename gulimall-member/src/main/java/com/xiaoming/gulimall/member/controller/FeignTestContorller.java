package com.xiaoming.gulimall.member.controller;

import com.xiaoming.common.utils.R;
import com.xiaoming.gulimall.member.feign.CouponFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignTestContorller {

    @Autowired // 需要开启远程调用功能,不然注入不进来,使用包扫描
    private CouponFeignService couponFeignService;

    @RequestMapping("/feignTest")
    public R test() {
        R membercoupons = couponFeignService.membercoupons();
        return R.ok().put("me", membercoupons);
    }

}
