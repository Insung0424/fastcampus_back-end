package com.fastcampus.jpa.book.manager.repository;

import com.fastcampus.jpa.book.manager.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class UserRepositoryTest {


    @Autowired
    private UserRepository userRepository;

//    @Test
//    void crud(){ //기본 쿼리 동작
//        userRepository.save(new User());
//
//        System.out.println(">>> "+ userRepository.findAll());
//    }

    @Test
    void crud(){
        userRepository.save(new User("david","david@fastcampus.com"));
        User user = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        user.setEmail("martin-updated@fastcampus.com");

        userRepository.save(user);
    }



}