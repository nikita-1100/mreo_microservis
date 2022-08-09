package com.example.gibdd_register.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="dps_register")
public class GibddRegisterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "vin")
    private String vin;

    @Column(name = "fine")
    private Boolean fine;

    @Column(name="fine_sum")
    private Integer fineSum;

    @Column(name="banned")
    private Boolean banned;
}
