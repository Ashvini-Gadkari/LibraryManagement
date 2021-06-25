package com.library.library_managment.model;

import javax.persistence.*;

@Entity
@Table(name ="admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long adminId;

    @Column(name = "admin_name")
    private String adminName;

    public Admin() {
    }

    public Admin(String adminName) {
        this.adminName = adminName;
    }

    public long getAdminId() {
        return adminId;
    }

    public void setAdminId(long adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }
}
