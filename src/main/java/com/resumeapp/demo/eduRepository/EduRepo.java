package com.resumeapp.demo.eduRepository;

import java.util.List;

import com.resumeapp.demo.eduEntity.Education;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EduRepo extends JpaRepository<Education, Long> {

    public interface EduDetails {

        String getEduId();

        String getUserID();

        String getUserCourse();

        String getUserCourseName();

        String getUserInstName();

        String getFromYr();

        String getToYr();

        String getUserCGPA();

    }

    @Query(value = "SELECT u.EDU_ID AS EDUID,u.USR_ID AS USERID,u.USER_COURSE AS USERCOURSE,u.USER_COURSENAME AS USERCOURSENAME,u.USER_INSTITUTION_NAME AS USERINSTNAME,"
            + "u.FROM_YR AS FROMYR,u.TO_YR AS TOYR,u.USER_CGPA AS USERCGPA FROM USER_EDUCATION_DETAILS u"
            + " WHERE u.USR_ID= :userId", nativeQuery = true)
    List<EduDetails> getEduDtlsByID(@Param("userId") Long userId);
}
