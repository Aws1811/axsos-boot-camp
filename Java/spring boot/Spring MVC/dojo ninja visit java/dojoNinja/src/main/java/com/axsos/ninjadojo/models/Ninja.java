package com.axsos.ninjadojo.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "ninjas")
public class Ninja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ninjaId ;
@NotNull(message = "the name shouldn't be empty")
@Size(min = 2 , max = 30 , message = "the first name should be between 2 and 30")
    private String firstName;
    @NotNull(message = "the name shouldn't be empty")
    @Size(min = 2 , max = 30 , message = "the last name should be between 2 and 30")
    private String lastName;

    @Min(12)
    @NotNull(message = "please fill the age")
    private Integer age;

    @Column(updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dojoId")
    private Dojo dojo ;

    public Ninja(){}

    public Ninja(Long ninjaId, String firstName, String lastName,Integer age) {
        this.ninjaId = ninjaId;
        this.age=age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getAge(){
        return age;
    }
    public void setAge(Integer age){
        this.age=age;
    }

    public Long getNinjaId() {
        return ninjaId;
    }

    public void setNinjaId(Long ninjaId) {
        this.ninjaId = ninjaId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    @PrePersist
    protected void onCreate(){
        this.createdAt=new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt=new Date();
    }

    public Dojo getDojo() { return dojo; }
    public void setDojo(Dojo dojo) { this.dojo = dojo; }
}
