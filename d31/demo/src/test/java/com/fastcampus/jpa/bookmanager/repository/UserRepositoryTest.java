package com.fastcampus.jpa.bookmanager.repository;

import com.fastcampus.jpa.bookmanager.domain.User;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    @Transactional
    void crud(){
//        h2 를 연결 간단확인용
//        userRepository.save(new User());

//        System.out.println(">>> "+ userRepository.findAll());
        //findall 테이블의 전체값을 가져옴 실제에서는 잘 사용 하지 않음
//        userRepository.findAll().forEach(System.out::println);
        //System.out::println 람다식
//        for(User user : userRepository.findAll()){
//            System.out.println(user);
//        }

//        List<User> users = userRepository.findAll(); 기본 출력
//
//        users.forEach(System.out::println);

//        List<User> users = userRepository.findAll(Sort.by(Sort.Direction.DESC,"name"));
//        //이름 역순 출력
//        users.forEach(System.out::println);

//        List<User> users = userRepository.findAllById(Lists.newArrayList(1l,3l,5l));
//        // 1,3,5 를 선택해서 가져옴
//        users.forEach(System.out::println);

//        User user1 = new User("jack","jack@naver.com");
//        User user2 = new User("steve","steve@naver.com");
//        userRepository.save(user1); //빌더를 사용한 객체 저장
        // jack 만 저장하고 insert 문이 한번만 나옴
        // hibernate_sequence 가 db에 새값을 추가 할때 id 값을 1씩 증가를 요청해서 받아오는 역할
//        List<User> users = userRepository.findAll();
//        users.forEach(System.out::println);

//        User user1 = new User("jack","jack@naver.com");
//        User user2 = new User("steve","steve@naver.com");
//        userRepository.saveAll(Lists.newArrayList(user1,user2)); //빌더를 사용한 객체 저장
//        // insert 문 이 2번 나옴
//        List<User> users = userRepository.findAll();
//        users.forEach(System.out::println);

//        User user = userRepository.getOne(1l); // @Transactional 이 있어야 사용가능하다
//        //레이지 패치?
//        System.out.println(user); //

//        Optional<User> user = userRepository.findById(1l);
        User user = userRepository.findById(1l).orElse(null);
        System.out.println(user);
    }

}