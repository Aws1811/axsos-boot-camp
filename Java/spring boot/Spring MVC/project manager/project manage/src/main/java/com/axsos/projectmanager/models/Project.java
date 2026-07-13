package com.axsos.projectmanager.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long project_id;

    @NotNull(message = "please fill the title")
    @Size(min = 2,max = 120,message = "please fill the blank")
    private String title;



//    @NotEmpty(message = "please fill the leader name ")
//    @Size(min = 2,max = 120,message = "please fill the blank")
    private String leaderName;

    @NotEmpty(message = "plaese fill the thoughts")
    @Size(min = 2,max = 120,message = "please fill the blank")
    private String description;

    @NotNull(message = "date must be provided")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @FutureOrPresent(message = "please enter a valid date")
    private LocalDate dueDate;

    @Column(updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatedAt;

    @ManyToOne(fetch =FetchType.LAZY)
    @JoinColumn(name = "id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "borrower_id")
    private User borrower;

    public Project(){}
    public Project(Long project_id, String title, String leaderName, String description, User user, User borrower,LocalDate dueDate) {
        this.project_id = project_id;
        this.borrower = borrower;
        this.title = title;
        this.leaderName = leaderName;
        this.user = user;
        this.description = description;
        this.dueDate = dueDate;
    }


    @PrePersist
    protected void onCreate(){
        this.createdAt=new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt=new Date();
    }


    public Long getProject_id() {
        return project_id;
    }

    public void setProject_id(Long project_id) {
        this.project_id = project_id;
    }

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
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

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public User getUser() {
        return user;
    }

    public User getBorrower() {
        return borrower;
    }

    public void setBorrower(User borrower) {
        this.borrower = borrower;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
