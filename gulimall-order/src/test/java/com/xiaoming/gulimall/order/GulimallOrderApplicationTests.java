package com.xiaoming.gulimall.order;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xiaoming.gulimall.order.entity.OrderItemEntity;
import com.xiaoming.gulimall.order.service.impl.OrderItemServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallOrderApplicationTests {

    @Autowired
    private OrderItemServiceImpl orderItemService;

    @Test
    void contextLoads() {
    }

    @Test
    public void set() {
        OrderItemEntity orderItem = new OrderItemEntity();
        orderItem.setCategoryId(1L);
        orderItem.setOrderSn("miiii");
        orderItemService.save(orderItem);
    }

    @Test
    public void get() {
        List<OrderItemEntity> list = orderItemService.list(new QueryWrapper<OrderItemEntity>().eq("category_id", 1));
        list.forEach((item) -> {
            System.out.println(item);
        });
    }

}
