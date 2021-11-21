package com.resumeapp.demo.repository;

import java.util.List;
import java.util.Optional;

import com.resumeapp.demo.entity.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Long> {

    public interface UserDetails {

        String getFname();

        String getLname();

        String getDob();

        String getEmail();

        String getMob();

        String getPass();

        String getLinkedIn();

        String getLocation();

        Long getUserId();
    }

    @Query(value = "SELECT u.USR_ID as USERID,u.USR_FNAME AS FNAME,u.USR_LNAME AS LNAME,u.DOB AS DOB,u.USR_EMAIL AS EMAIL,u.USR_MOBILE AS MOB,u.USR_PASS AS PASS,u.USR_LINKEDIN AS LINKEDIN,u.USR_LOCATION AS LOCATION FROM USERS u \r\n"
            + " WHERE u.USR_ID= :userId", nativeQuery = true)
    List<UserDetails> getUsersDtlsByID(@Param("userId") Long userId);

    @Query(value = "SELECT u.* FROM USERS u WHERE u.USR_EMAIL = :email AND u.USR_PASS = :userPass ", nativeQuery = true)
    Optional<Users> validateUserByCreds(@Param("email") String email, @Param("userPass") String userPass);

    @Query(value = "SELECT COUNT(USR_ID) FROM USERS WHERE USR_EMAIL = :email ", nativeQuery = true)
    int userEmailCount(@Param("email") String email);

}
