package com.fintech.invext.controller.mapper;

import com.fintech.invext.controller.request.OrderRequest;
import com.fintech.invext.controller.response.OrderResponse;
import com.fintech.invext.model.Order;
import com.fintech.invext.model.enums.Status;
import lombok.experimental.UtilityClass;

import java.time.LocalDateTime;

@UtilityClass
public class OrderMapper {

    public OrderResponse map(final Order order) {
        return new OrderResponse(order.getDescription(), order.getType(), order.getStatus());
    }

    public Order map(final OrderRequest orderRequest) {
        Order order = new Order();
        order.setDescription(orderRequest.description());
        order.setType(orderRequest.type());
        order.setStatus(Status.OPEN);
        order.setCreatedOn(LocalDateTime.now());

        return order;
    }
}
