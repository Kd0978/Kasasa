package com.demo.loan.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_loan")
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name", unique = true, updatable = false)
    private String name;
    private String ssn;
    private Date dob;
    private Double loanAmount;
    private Double rate;
    private LoanType type;
    private short term;
    private Double apr;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public LoanType getType() {
        return type;
    }

    public void setType(LoanType type) {
        this.type = type;
    }

    public short getTerm() {
        return term;
    }

    public void setTerm(short term) {
        this.term = term;
    }

    public Double getApr() {
        return apr;
    }

    public void setApr(Double apr) {
        this.apr = apr;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                ", dob=" + dob +
                ", loanAmount=" + loanAmount +
                ", rate=" + rate +
                ", type=" + type +
                ", term=" + term +
                ", apr=" + apr +
                '}';
    }
}
