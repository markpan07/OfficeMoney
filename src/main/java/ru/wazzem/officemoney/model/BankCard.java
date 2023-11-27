package ru.wazzem.officemoney.model;

import jakarta.persistence.*;

@Entity
public class BankCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Long number;
    @Column
    private String bankName;

    @ManyToOne()
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
