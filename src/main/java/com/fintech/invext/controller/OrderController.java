package com.fintech.invext.controller;

import com.fintech.invext.controller.mapper.OrderMapper;
import com.fintech.invext.controller.request.OrderRequest;
import com.fintech.invext.controller.response.OrderResponse;
import com.fintech.invext.model.Order;
import com.fintech.invext.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/order")
public class OrderController {

    private final OrderService orderService;

    @PatchMapping(path = "/link/{idAttendat}")
    public OrderResponse link(@PathVariable final Long idAttendat) {

        Order order = orderService.linkOrderAttendat(idAttendat);

        return OrderMapper.map(order);
    }

    @PostMapping
    public OrderResponse create(@RequestBody OrderRequest orderRequest) {
        Order order = OrderMapper.map(orderRequest);
        Order orderCreated = orderService.create(order);
        return OrderMapper.map(orderCreated);
    }

}
