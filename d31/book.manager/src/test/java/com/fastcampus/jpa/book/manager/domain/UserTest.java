package com.fastcampus.jpa.book.manager.domain;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.EnableMBeanExport;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void Test(){
        User user = new User();
        user.setEmail("agdistis@naver.com");
        user.setName("agdistis");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

        System.out.println(">>> "+user);//toString이 생략되어있음

        User user1 = new User("agdistis","agdistis@naver.com", LocalDateTime.now(), LocalDateTime.now());
        User user2 = new User("agdistis","agdistis@naver.com");

        User user3 = User.builder().name("agdistis").email("agdistis@naver.com").build();
    }

}