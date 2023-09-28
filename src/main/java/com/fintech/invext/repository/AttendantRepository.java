package com.fintech.invext.repository;

import com.fintech.invext.model.Attendant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendantRepository extends JpaRepository<Attendant, Long> {
}
