package com.resumeapp.demo.service;

import java.util.Map;

import com.resumeapp.demo.entity.Users;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public Users createUser(Users users) throws Exception;

    public Users validateUser(Users users);

    public Map<String, Object> getUserResumeData(Long userId);

}
