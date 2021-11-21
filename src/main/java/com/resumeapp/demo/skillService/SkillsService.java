package com.resumeapp.demo.skillService;

import java.util.List;

import com.resumeapp.demo.skillEntity.Skills;
import com.resumeapp.demo.skillRepository.SkillsRepo.SkillDetails;

import org.springframework.stereotype.Service;

@Service
public interface SkillsService {

    public Skills addSkills(Skills skills);

    public List<SkillDetails> getSkillDetails(Long userId);

}
