package com.resumeapp.demo.skillController;

import java.util.List;

import com.resumeapp.demo.skillEntity.Skills;
import com.resumeapp.demo.skillRepository.SkillsRepo.SkillDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SkillController {

    @Autowired
    private com.resumeapp.demo.skillService.SkillsService skillsService;

    @PostMapping("/addSkills")
    public Skills addSkills(@RequestBody Skills skills) throws Exception {

        Skills userResponse = skillsService.addSkills(skills);
        return userResponse;
    }

    @GetMapping("/getSkills/{userId}")
    public List<SkillDetails> getSkillString(@PathVariable(name = "userId") Long userId){

        List<SkillDetails> userResp = skillsService.getSkillDetails(userId);
        return userResp;
    }

}
