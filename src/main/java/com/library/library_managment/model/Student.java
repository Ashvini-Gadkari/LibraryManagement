package com.library.library_managment.model;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "email")
    private String EmailId;
    @Column(name = "password")
    private String password;

    public Student() {
    }

    public Student(String firstName, String emailId, String password) {
        this.firstName = firstName;
        EmailId = emailId;
        this.password = password;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailId() {
        return EmailId;
    }

    public void setEmailId(String emailId) {
        EmailId = emailId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public long getId() {
        return Id;
    }

    public void setId(long studId) {
        this.Id = studId;
    }
}
