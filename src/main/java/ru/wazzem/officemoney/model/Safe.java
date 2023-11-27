package ru.wazzem.officemoney.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.Set;

@Entity
public class Safe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private BigDecimal balance;
    @Column
    @OneToMany(mappedBy = "safe")
    private Set<BankCard> cards;

    public Safe(){

    }

    public Long getId(){
        return id;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public Set<BankCard> getCards(){
        return cards;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void setCards(Set<BankCard> cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "Safe{" +
                "id=" + id +
                ", balance=" + balance +
                ", cards=" + cards +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Safe safe)) return false;
        return Objects.equals(id, safe.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
