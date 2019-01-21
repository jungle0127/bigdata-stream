package com.ps.fescar.order.service;

import com.ps.fescar.order.model.Order;

public interface OrderService {
    Order create(String userId, String commodityCode, Integer orderCount);
}
