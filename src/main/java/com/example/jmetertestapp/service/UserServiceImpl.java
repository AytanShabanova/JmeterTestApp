package com.example.jmetertestapp.service;

import com.example.jmetertestapp.entity.User;
import com.example.jmetertestapp.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserServiceInter {
    private final UserRepo userRepo;

    @Override
    public String saveUser(@RequestParam String name) {
       User user = new User();
       user.setName(name);
       userRepo.save(user);
       return user.getName();

    }
}
