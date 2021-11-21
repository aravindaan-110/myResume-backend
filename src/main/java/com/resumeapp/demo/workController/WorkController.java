package com.resumeapp.demo.workController;

import java.util.List;

import com.resumeapp.demo.workEntity.Works;
import com.resumeapp.demo.workRepository.WorkRepo.WorkDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WorkController {

    @Autowired
    private com.resumeapp.demo.workService.WorkService workService;

    @PostMapping("/addWork")
    public Works addWork(@RequestBody Works works) throws Exception {

        Works userResponse = workService.addWork(works);
        return userResponse;
    }

    @GetMapping("/getWork/{userId}")
    public List<WorkDetails> getWorkString(@PathVariable(name = "userId") Long userId) {

        List<WorkDetails> userResp = workService.getWorkDetails(userId);
        return userResp;
    }

}
