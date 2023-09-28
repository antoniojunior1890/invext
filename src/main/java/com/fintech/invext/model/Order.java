package com.fintech.invext.model;

import com.fintech.invext.model.enums.Status;
import com.fintech.invext.model.enums.Type;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="Orders")
@AllArgsConstructor
@RequiredArgsConstructor
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Type type;
    private Status status;
    private LocalDateTime createdOn;
    @ManyToOne
    @JoinColumn(name="attendant_id", nullable=true)
    private Attendant attendant;


}
