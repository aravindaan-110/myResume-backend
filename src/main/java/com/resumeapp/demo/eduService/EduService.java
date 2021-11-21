package com.resumeapp.demo.eduService;

import java.util.List;

import com.resumeapp.demo.eduEntity.Education;
import com.resumeapp.demo.eduRepository.EduRepo.EduDetails;

import org.springframework.stereotype.Service;

@Service
public interface EduService {

    public Education addEduDetails(Education usersEducation);

    public List<EduDetails> getEduDetails(Long userId);

}
