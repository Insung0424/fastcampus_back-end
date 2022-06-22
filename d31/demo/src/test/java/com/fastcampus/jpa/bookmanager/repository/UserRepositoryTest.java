package com.fastcampus.jpa.bookmanager.repository;

import com.fastcampus.jpa.bookmanager.domain.User;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.*;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.contains;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.endsWith;


@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
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
//        User user = userRepository.findById(1l).orElse(null);
//        System.out.println(user);

//        userRepository.save(new User("newMartin","newMartin@fastcampus.com"));
//        userRepository.flush();
//        userRepository.findAll().forEach(System.out::println);
        // 새 객체 저장(6번) 하고 모두 찾아옴  위 와 아래 같은 결과값
//        userRepository.saveAndFlush(new User("newMartin","newMartin@fastcampus.com"));
//        userRepository.findAll().forEach(System.out::println);

//        Long count = userRepository.count(); // 저장되있는 갯수 유저객체수를 반환
//        System.out.println(count);

//        boolean exists = userRepository.existsById(1l); //해당 entity 가 존재 하는지 확인
//        System.out.println(exists);

//        userRepository.delete(userRepository.findById(1l).orElseThrow(RuntimeException::new));
//        userRepository.deleteAllById(Collections.singleton(1L)); //delete 전에 select가 한번 나오는 이유
//        userRepository.findAll().forEach(System.out::println); //존재하는지 확인작업

//        userRepository.deleteAll(userRepository.findAllById(Lists.newArrayList(1L,3L)));
        //1번 3번 선택해서 삭제
//        userRepository.findAll().forEach(System.out::println);

        // 검색후 확인해서 삭제가 아니라 바로 삭제하는 방식
//        userRepository.deleteAllInBatch();
////userRepository.deleteInBatch(userRepository.findAllById(Lists.newArrayList(1L, 3L))); 위로 변경됬다고 함
//        userRepository.findAll().forEach(System.out::println);

        //----------------------------페이징-----------------------
//        Page<User> users = userRepository.findAll(PageRequest.of(1,3));
//        System.out.println(users); //Page 2 of 2 containing com.fastcampus.jpa.bookmanager.domain.User instances
//        System.out.println("totalElements :"+users.getTotalElements());//totalElements :5
//        System.out.println("totalPages: "+users.getTotalPages());//totalPages: 2
//        System.out.println("numberOfElements:"+ users.getNumberOfElements());//numberOfElements:2
//        System.out.println("sort: "+users.getSort());//sort: UNSORTED
//        System.out.println("size: "+ users.getSize());//size: 3
//        users.getContent().forEach(System.out::println);

//        ExampleMatcher matcher = ExampleMatcher.matching()
////                .withIgnorePaths("name")
//                .withMatcher("email",endsWith());
//        Example<User> example = Example.of(new User("ma","fastcampus.com"),matcher);
//        userRepository.findAll(example).forEach(System.out::println);

//        Example<User> example = Example.of(new User("ma","fastcampus.com"));
//        userRepository.findAll(example).forEach(System.out::println); // name,email 을 가져옴

//        User user = new User();
//        user.setEmail("slow");
//        ExampleMatcher matcher = ExampleMatcher.matching().withMatcher("email",contains());
//        Example<User> example = Example.of(user,matcher);
//          //
//        userRepository.findAll(example).forEach(System.out::println);
    }

}