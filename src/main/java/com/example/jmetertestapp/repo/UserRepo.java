package com.example.jmetertestapp.repo;

import com.example.jmetertestapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {

}
