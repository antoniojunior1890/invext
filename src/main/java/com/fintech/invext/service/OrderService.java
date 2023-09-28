package com.fintech.invext.service;

import com.fintech.invext.exception.BusinessException;
import com.fintech.invext.model.Attendant;
import com.fintech.invext.model.Order;
import com.fintech.invext.model.enums.Status;
import com.fintech.invext.repository.AttendantRepository;
import com.fintech.invext.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final AttendantRepository attendantRepository;
    public Order linkOrderAttendat(Long idAttendat) {
        long count = orderRepository.countByAttendantIdAndStatus(idAttendat, Status.IN_PROGRESS);

        if(count >= 3) {
            throw new BusinessException("Possivel apenas 3 chamados simutaneamente");
        }

        Attendant attendant = attendantRepository.findById(idAttendat).orElseThrow(() -> new BusinessException("Não foi encontrado atendente"));

        Order order = orderRepository.findFirstByDepartmentAndStatusOrderByCreatedOnDesc(attendant.getType(), Status.OPEN).orElseThrow(() -> new BusinessException("Sem ordem disponivel"));

        order.setAttendant(attendant);
        order.setStatus(Status.IN_PROGRESS);

        return orderRepository.save(order);
    }

    public Order create(Order order) {
        return orderRepository.save(order);
    }
}
