package com.resumeapp.demo.model;

import java.util.List;

import com.resumeapp.demo.eduRepository.EduRepo.EduDetails;
import com.resumeapp.demo.entity.Users;
import com.resumeapp.demo.skillRepository.SkillsRepo.SkillDetails;
import com.resumeapp.demo.workRepository.WorkRepo.WorkDetails;

public class ResumeResponse {

    private Users userResp;
    private List<EduDetails> eduResp;
    private List<WorkDetails> workResp;
    private List<SkillDetails> skillsResp;

    public Users getUserResp() {
        return userResp;
    }

    public void setUserResp(Users userResp) {
        this.userResp = userResp;
    }

    public List<EduDetails> getEduResp() {
        return eduResp;
    }

    public void setEduResp(List<EduDetails> eduResp) {
        this.eduResp = eduResp;
    }

    public List<WorkDetails> getWorkResp() {
        return workResp;
    }

    public void setWorkResp(List<WorkDetails> workResp) {
        this.workResp = workResp;
    }

    public List<SkillDetails> getSkillsResp() {
        return skillsResp;
    }

    public void setSkillsResp(List<SkillDetails> skillsResp) {
        this.skillsResp = skillsResp;
    }

}
