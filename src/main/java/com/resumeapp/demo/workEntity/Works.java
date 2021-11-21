package com.resumeapp.demo.workEntity;

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
@Table(name = "USER_WORK_DETAILS")

public class Works implements Serializable {

    private static final long serialVersionUID = -4704263209497078927L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "WORK_ID")
    @NonNull
    private int workID;

    @Column(name = "USR_ID")
    @NonNull
    private int userID;

    @Column(name = "USER_SUMMARY")
    @NonNull
    private String userSummary;

    @Column(name = "USER_COMPANY_NAME")
    @NonNull
    private String userCompName;

    @Column(name = "USER_JOB_TITLE")
    @NonNull
    private String userJobTitle;

    @Column(name = "FROM_YR")
    @NonNull
    private int fromYr;

    @Column(name = "TO_YR")
    @NonNull
    private int toYr;

    @Column(name = "JOB_DESC")
    @NonNull
    private String jobDesc;

    @Column(name = "CRTD_DT")
    @CreationTimestamp
    private LocalDateTime crtdDate;

    @Column(name = "UPTD_DT")
    @UpdateTimestamp
    private LocalDateTime uptdDate;

    public Works() {
        super();
    }

    public Works(int workID, int userID, String userSummary, String userCompName, String userJobTitle, int fromYr,
            int toYr, String jobDesc) {
        this.workID = workID;
        this.userID = userID;
        this.userSummary = userSummary;
        this.userCompName = userCompName;
        this.userJobTitle = userJobTitle;
        this.fromYr = fromYr;
        this.toYr = toYr;
        this.jobDesc = jobDesc;
    }

    public int getWorkID() {
        return workID;
    }

    public void setWorkID(int workID) {
        this.workID = workID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserSummary() {
        return userSummary;
    }

    public void setUserSummary(String userSummary) {
        this.userSummary = userSummary;
    }

    public String getUserCompName() {
        return userCompName;
    }

    public void setUserCompName(String userCompName) {
        this.userCompName = userCompName;
    }

    public String getUserJobTitle() {
        return userJobTitle;
    }

    public void setUserJobTitle(String userJobTitle) {
        this.userJobTitle = userJobTitle;
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

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
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
