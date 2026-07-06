package com.axsos.burgertruker.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

// this is the table sql
@Entity
@Table(name = "BurgerTracker")
public class Burger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    @NotNull
    @Size(min = 2,max = 20,message = "please input a burger name between 2 and 20")
    private String burgerName;

    @NotNull
    @Size(min = 2,max = 20,message = "please input a resturant name between 2 and 20")
    private String resturantName;

    @NotNull
    @Min(value = 1, message = "rating must be at least 1")
    @Max(value = 5, message = "rating must be at most 5")
    private int rating;

    @NotNull
    @Size(max = 100,min = 6 ,message = "plaese enter somthing nice to us")
    private String note;

    @Column(updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatedAt;
// the constractor
    public Burger(){}
    public Burger(String bName,String restName,int rating,String note){
        this.burgerName=bName;
        this.resturantName= restName;
        this.note=note;
        this.rating=rating;
    }

    @PrePersist
    protected void onCreate(){
        this.createdAt=new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt=new Date();
    }
// getters and the setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBurgerName() {
        return burgerName;
    }

    public void setBurgerName(String burgerName) {
        this.burgerName = burgerName;
    }

    public String getResturantName() {
        return resturantName;
    }

    public void setResturantName(String resturantName) {
        this.resturantName = resturantName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
