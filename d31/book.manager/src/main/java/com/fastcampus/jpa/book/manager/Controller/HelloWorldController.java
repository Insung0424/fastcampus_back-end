package com.fastcampus.jpa.book.manager.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//rest api 의 요청을 받음
public class HelloWorldController {

    @GetMapping("/hello-world") //http 메소드를 get으로 받겠다
    public String helloWorld(){
        return "hello-world";
    }

}
