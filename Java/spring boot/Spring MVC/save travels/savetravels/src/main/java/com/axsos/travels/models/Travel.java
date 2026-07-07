package com.axsos.travels.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "travels")
public class Travel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 30,min = 2,message = "please enter expense name ,it should be between 2 and 30 charcters please")
    private String expense;

    @Size(max = 30,min = 2,message = "please enter vendor name ,it should be between 2 and 30 charcters please")
    @NotNull
    private String vendor;

    @Min(value = 0,message = "amount should be bigger than 0")
    private Integer amount;

    @Size(min = 6,max = 200 , message = "description must not be blank")
    @NotNull
    @Column(name = "description")
    private String desc;

    public Travel(){}
    public Travel(String expense,String vendor,Integer amount,String desc){
        this.amount=amount;
        this.desc=desc;
        this.expense=expense;
        this.vendor=vendor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExpense() {
        return expense;
    }

    public void setExpense(String expense) {
        this.expense = expense;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

