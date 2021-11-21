package com.resumeapp.demo.eduServiceImpl;

import java.util.List;

import com.resumeapp.demo.eduEntity.Education;
import com.resumeapp.demo.eduRepository.EduRepo;
import com.resumeapp.demo.eduRepository.EduRepo.EduDetails;
import com.resumeapp.demo.eduService.EduService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EduServiceImpl implements EduService {

    @Autowired
    EduRepo eduRepo;

    @Override
    public Education addEduDetails(Education usersEducation) {

        usersEducation.setUserId(1);
        Education education = eduRepo.save(usersEducation);
        return education;
    }

    @Override
    public List<EduDetails> getEduDetails(Long userId) {

        List<EduDetails> userResp = eduRepo.getEduDtlsByID(userId);
        return userResp;
    }

}
