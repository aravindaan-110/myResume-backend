package com.resumeapp.demo.workService;

import java.util.List;

import com.resumeapp.demo.workEntity.Works;
import com.resumeapp.demo.workRepository.WorkRepo.WorkDetails;

import org.springframework.stereotype.Service;

@Service
public interface WorkService {

    public Works addWork(Works works);

    public List<WorkDetails> getWorkDetails(Long userId);

}
