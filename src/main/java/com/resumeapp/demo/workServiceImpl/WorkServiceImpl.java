package com.resumeapp.demo.workServiceImpl;

import java.util.List;

import com.resumeapp.demo.workEntity.Works;
import com.resumeapp.demo.workRepository.WorkRepo;
import com.resumeapp.demo.workRepository.WorkRepo.WorkDetails;
import com.resumeapp.demo.workService.WorkService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkServiceImpl implements WorkService {

    @Autowired
    WorkRepo workRepo;

    @Override
    public Works addWork(Works userWorks) {

        Works userResp = workRepo.save(userWorks);
        return userResp;
    }

    @Override
    public List<WorkDetails> getWorkDetails(Long userId) {

        List<WorkDetails> userResp = workRepo.getWorkDetlsByID(userId);
        return userResp;
    }

}
