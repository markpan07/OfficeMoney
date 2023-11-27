package ru.wazzem.officemoney.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Set;

@Entity(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column
    private String surname;
    @Column
    private String thirdName;
    @Column
    private BigDecimal balance;
    @OneToMany(mappedBy = "employee")
    private Set<BankCard> cards;

}
