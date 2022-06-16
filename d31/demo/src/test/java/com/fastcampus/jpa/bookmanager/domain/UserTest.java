package com.fastcampus.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class UserTest {

    @Test
    void test(){
        User user = new User();
        user.setEmail("agdistis@naver.com");
        user.setName("agdistis");

        User user1 = User.builder().name("agdistis").email("agdistis@naver.com").build();
        System.out.println(">>> " + user1);
    }

}