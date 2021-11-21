package com.resumeapp.demo.skillServiceImpl;

import java.util.List;

import com.resumeapp.demo.skillEntity.Skills;
import com.resumeapp.demo.skillRepository.SkillsRepo;
import com.resumeapp.demo.skillRepository.SkillsRepo.SkillDetails;
import com.resumeapp.demo.skillService.SkillsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsServiceImpl implements SkillsService {

    @Autowired
    SkillsRepo skillsRepo;

    @Override
    public Skills addSkills(Skills userSkills) {
        Skills education = skillsRepo.save(userSkills);
        return education;
    }

    @Override
    public List<SkillDetails> getSkillDetails(Long userId) {

        List<SkillDetails> userResp = skillsRepo.getSkillDtlsByID(userId);
        return userResp;
    }
}
