package com.example.jmetertestapp.controller;

import com.example.jmetertestapp.entity.User;
import com.example.jmetertestapp.service.UserServiceInter;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
    private final UserServiceInter userServiceInter;
    @Transactional
    @PostMapping("/create")
    public void saveUser(String name){
        userServiceInter.saveUser(name);
    }

    @GetMapping("/simulate")
    public String simulateDelay() throws InterruptedException {
        Thread.sleep(500);  // 500ms gecikmə simulyasiyası
        return "Delayed API response!";
    }



}
