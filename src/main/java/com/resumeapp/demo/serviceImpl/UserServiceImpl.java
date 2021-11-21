package com.resumeapp.demo.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.resumeapp.demo.eduRepository.EduRepo;
import com.resumeapp.demo.eduRepository.EduRepo.EduDetails;
import com.resumeapp.demo.entity.Users;
import com.resumeapp.demo.repository.UserRepo;
import com.resumeapp.demo.repository.UserRepo.UserDetails;
import com.resumeapp.demo.service.UserService;
import com.resumeapp.demo.skillRepository.SkillsRepo;
import com.resumeapp.demo.skillRepository.SkillsRepo.SkillDetails;
import com.resumeapp.demo.workRepository.WorkRepo;
import com.resumeapp.demo.workRepository.WorkRepo.WorkDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    EduRepo eduRepo;

    @Autowired
    SkillsRepo skillsRepo;

    @Autowired
    WorkRepo workRepo;

    @Override
    public Users createUser(Users users) throws Exception {
        int userCount = userRepo.userEmailCount(users.getEmail());
        if (userCount == 0) {
            Users userResp = userRepo.save(users);
            return userResp;
        } else {
            throw new Exception("This user already exists!");
        }
    }

    @Override
    public Users validateUser(Users users) {

        Users usertemp = null;

        // UserDetails userResp;
        Optional<Users> validUser = userRepo.validateUserByCreds(users.getEmail(), users.getPass());

        if (validUser != null && validUser.isPresent()) {
            // userResp = userRepo.getUsersDtlsByID(validUser.get().getUserId());
            usertemp = userRepo.getById(validUser.get().getUserId());

        }
        return usertemp;
    }

    @Override
    public Map<String, Object> getUserResumeData(Long userId) {

        Map<String, Object> resumeResponse = new HashMap<String, Object>();
        List<UserDetails> userDetails;
        List<EduDetails> eduDetails;
        List<WorkDetails> workDetails;
        List<SkillDetails> skillDetails;

        if (userId != null) {
            userDetails = userRepo.getUsersDtlsByID(userId);
            resumeResponse.put("userDetails", userDetails);

            eduDetails = eduRepo.getEduDtlsByID(userId);
            resumeResponse.put("eduDetails", eduDetails);

            workDetails = workRepo.getWorkDetlsByID(userId);
            resumeResponse.put("workDetails", workDetails);

            skillDetails = skillsRepo.getSkillDtlsByID(userId);
            resumeResponse.put("skillDetails", skillDetails);
        }

        return resumeResponse;
    }

}
