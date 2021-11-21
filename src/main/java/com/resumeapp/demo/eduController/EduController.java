package com.resumeapp.demo.eduController;

import java.util.List;

import com.resumeapp.demo.eduEntity.Education;
import com.resumeapp.demo.eduRepository.EduRepo.EduDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EduController {

    @Autowired
    private com.resumeapp.demo.eduService.EduService eduService; // Service package

    @CrossOrigin(origins = "http://localhost:4200/")
    @PostMapping("/addEduDetails")
    public Education addEduDetails(@RequestBody Education usersEducation) throws Exception {

        Education userResponse = eduService.addEduDetails(usersEducation);
        return userResponse;
    }

    @GetMapping("/getEdu/{userId}")
    public List<EduDetails> getEduString(@PathVariable(name = "userId") Long userId) {

        List<EduDetails> userResponse = eduService.getEduDetails(userId);
        return userResponse;
    }
}
