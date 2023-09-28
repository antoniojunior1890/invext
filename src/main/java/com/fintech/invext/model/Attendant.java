package com.fintech.invext.model;

import com.fintech.invext.model.enums.Type;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name="Attendant")
public class Attendant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Type type;
    @OneToMany(mappedBy="attendant")
    private List<Order> orders;
}
