package com.fintech.invext.repository;

import com.fintech.invext.model.Order;
import com.fintech.invext.model.enums.Status;
import com.fintech.invext.model.enums.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query(value="SELECT COUNT(*) FROM Order o WHERE o.attendant.id = ?1 AND o.status = ?2")
    long countByAttendantIdAndStatus(Long idAttendat, Status value);

    @Query(value="select o from Order o where o.type = ?1 AND o.status = ?2 order by o.createdOn asc LIMIT 1")
    Optional<Order> findFirstByDepartmentAndStatusOrderByCreatedOnDesc(Type type, Status status);
}
