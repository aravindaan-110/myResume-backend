package com.resumeapp.demo.entity;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import io.micrometer.core.lang.NonNull;

@Entity
@Table(name = "USERS")

public class Users implements Serializable {

    private static final long serialVersionUID = -4704263209497078927L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "USR_ID")
    @NonNull
    private Long userId;

    @Column(name = "USR_FNAME")
    @NonNull
    private String fname;

    @Column(name = "USR_LNAME")
    @NonNull
    private String lname;

    @Column(name = "DOB")
    @NonNull
    private Date dob;

    @Column(name = "USR_EMAIL")
    @NonNull
    private String email;

    @Column(name = "USR_PASS")
    @NonNull
    private String pass;

    @Column(name = "USR_MOBILE")
    @NonNull
    private String mob;

    @Column(name = "USR_LINKEDIN")
    @NonNull
    private String linkedIn;

    @Column(name = "USR_LOCATION")
    @NonNull
    private String location;

    @Column(name = "CRTD_DT")
    @CreationTimestamp
    private LocalDateTime crtdDate;

    @Column(name = "UPTD_DT")
    @UpdateTimestamp
    private LocalDateTime uptdDate;

    public Users() {
        super();
    }

    public Users(Long userId, String fname, String lname, Date dob, String email, String pass, String mob,
            String linkedIn, String location) {

        this.userId = userId;
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.email = email;
        this.pass = pass;
        this.mob = mob;
        this.linkedIn = linkedIn;
        this.location = location;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDateTime getCrtdDate() {
        return crtdDate;
    }

    public void setCrtdDate(LocalDateTime crtdDate) {
        this.crtdDate = crtdDate;
    }

    public LocalDateTime getUptdDate() {
        return uptdDate;
    }

    public void setUptdDate(LocalDateTime uptdDate) {
        this.uptdDate = uptdDate;
    }

}
