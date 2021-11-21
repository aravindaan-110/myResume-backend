package com.resumeapp.demo.skillEntity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.lang.NonNull;

@Entity
@Table(name = "USER_SKILL_DETAILS")
public class Skills implements Serializable {

    private static final long serialVersionUID = -4704263209497078927L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "SKILL_ID")
    @NonNull
    private int skillID;

    @Column(name = "USR_ID")
    @NonNull
    private int userID;

    @Column(name = "USER_TYPE")
    @NonNull
    private String userType;

    @Column(name = "TYPE_DESC")
    @NonNull
    private String typeDesc;

    @Column(name = "TYPE_RATING")
    @NonNull
    private int typeRating;

    @Column(name = "CRTD_DT")
    @CreationTimestamp
    private LocalDateTime crtdDate;

    @Column(name = "UPTD_DT")
    @UpdateTimestamp
    private LocalDateTime uptdDate;

    public Skills() {
        super();
    }

    public Skills(int skillID, int userID, String userType, String typeDesc, int typeRating) {
        this.skillID = skillID;
        this.userID = userID;
        this.userType = userType;
        this.typeDesc = typeDesc;
        this.typeRating = typeRating;
    }

    public int getSkillID() {
        return skillID;
    }

    public void setSkillID(int skillID) {
        this.skillID = skillID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public int getTypeRating() {
        return typeRating;
    }

    public void setTypeRating(int typeRating) {
        this.typeRating = typeRating;
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
