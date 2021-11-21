package com.resumeapp.demo.skillRepository;

import java.util.List;

import com.resumeapp.demo.skillEntity.Skills;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepo extends JpaRepository<Skills, Long> {

    public interface SkillDetails {
        String getSkillID();

        String getUserID();

        String getUserType();

        String getTypeDesc();

        String getTypeRating();
    }

    @Query(value = "SELECT u.SKILL_ID AS SKILLID,u.USR_ID AS USERID,u.USER_TYPE AS USERTYPE,"
            + "u.TYPE_DESC AS TYPEDESC,u.TYPE_RATING AS TYPERATING FROM USER_SKILL_DETAILS u WHERE "
            + "u.USR_ID= :userId", nativeQuery = true)
    List<SkillDetails> getSkillDtlsByID(@Param("userId") Long userId);
}
