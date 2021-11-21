package com.resumeapp.demo.workRepository;

import java.util.List;

import com.resumeapp.demo.workEntity.Works;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkRepo extends JpaRepository<Works, Long> {

    public interface WorkDetails {
        String getWorkID();

        String getUserID();

        String getUserSummary();

        String getUserCompName();

        String getUserJobTitle();

        String getFromYr();

        String getToYr();

        String getJobDesc();

    }

    @Query(value = "SELECT u.WORK_ID AS WORKID,u.USR_ID AS USERID,u.USER_SUMMARY AS USERSUMMARY,"
            + "u.USER_COMPANY_NAME AS USERCOMPNAME,u.USER_JOB_TITLE AS USERJOBTITLE,u.JOB_DESC AS JOBDESC,u.FROM_YR AS FROMYR,"
            + "u.TO_YR AS TOYR FROM USER_WORK_DETAILS u WHERE u.USR_ID= :userId", nativeQuery = true)
    List<WorkDetails> getWorkDetlsByID(@Param("userId") Long userId);

}
