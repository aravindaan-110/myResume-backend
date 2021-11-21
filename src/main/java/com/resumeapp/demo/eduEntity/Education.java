package com.resumeapp.demo.eduEntity;

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
@Table(name = "USER_EDUCATION_DETAILS")

public class Education implements Serializable {

    private static final long serialVersionUID = -4704263209497078927L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "EDU_ID")
    @NonNull
    private int eduId;

    @Column(name = "USR_ID")
    @NonNull
    private int userId;

    @Column(name = "USER_COURSE")
    @NonNull
    private String userCourse;

    @Column(name = "USER_COURSENAME")
    @NonNull
    private String userCourseName;

    @Column(name = "USER_INSTITUTION_NAME")
    @NonNull
    private String userInstName;

    @Column(name = "FROM_YR")
    @NonNull
    private int fromYr;

    @Column(name = "TO_YR")
    @NonNull
    private int toYr;

    @Column(name = "USER_CGPA")
    @NonNull
    private float userCGPA;

    @Column(name = "CRTD_DT")
    @CreationTimestamp
    private LocalDateTime crtdDate;

    @Column(name = "UPTD_DT")
    @UpdateTimestamp
    private LocalDateTime uptdDate;

    public Education() {
        super();
    }

    public Education(int eduId, int userId, String userCourse, String userCourseName, String userInstName, int fromYr,
            int toYr, float userCGPA) {
        this.eduId = eduId;
        this.userId = userId;
        this.userCourse = userCourse;
        this.userCourseName = userCourseName;
        this.userInstName = userInstName;
        this.fromYr = fromYr;
        this.toYr = toYr;
        this.userCGPA = userCGPA;
    }

    public int getEduId() {
        return eduId;
    }

    public void setEduId(int eduId) {
        this.eduId = eduId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserCourse() {
        return userCourse;
    }

    public void setUserCourse(String userCourse) {
        this.userCourse = userCourse;
    }

    public String getUserCourseName() {
        return userCourseName;
    }

    public void setUserCourseName(String userCourseName) {
        this.userCourseName = userCourseName;
    }

    public String getUserInstName() {
        return userInstName;
    }

    public void setUserInstName(String userInstName) {
        this.userInstName = userInstName;
    }

    public int getFromYr() {
        return fromYr;
    }

    public void setFromYr(int fromYr) {
        this.fromYr = fromYr;
    }

    public int getToYr() {
        return toYr;
    }

    public void setToYr(int toYr) {
        this.toYr = toYr;
    }

    public float getUserCGPA() {
        return userCGPA;
    }

    public void setUserCGPA(float userCGPA) {
        this.userCGPA = userCGPA;
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
