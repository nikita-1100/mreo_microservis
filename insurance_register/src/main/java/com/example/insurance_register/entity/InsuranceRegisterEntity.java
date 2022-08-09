package com.example.insurance_register.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="insurance_register")
public class InsuranceRegisterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "vin")
    private String vin;
    @Column(name="date_start")
    private LocalDate dateStart;
    @Column(name="date_end")
    private LocalDate dateEnd;
}
