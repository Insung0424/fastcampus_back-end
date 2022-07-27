package com.example.spring_start.controller;

import com.example.spring_start.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping("/hello")
    public String Hello(){
        return "get hello";
    }

    // 이전에 사용 하던 방식
    @RequestMapping(path = "/hi",method = RequestMethod.GET)
    public String hi(){
        return "hi";
    }

    // api/get/path-variable/{name}
    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable(name= "name") String pathname){
        System.out.println("pathvariable : " +pathname);
        return pathname;
    }

    // api/get/query-param?user=steve&email=steve@gamil.com&age=30
    @GetMapping("query-param")
    public String queryParam(@RequestParam Map<String,String> queryParam){
        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach( entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey()+"=" + entry.getValue()+"\n");
        });

        return sb.toString();
    }

    // 쿼리가 길어질수록 변수를 추가 해줘야하는 불편함이 있다다
   @GetMapping("query-param2")
    public String queryParam2(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age

    ){
        return name+" "+email+" "+age;
    }

    @GetMapping("query-param3")
    public String queryParam3(UserRequest userRequest){

        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        return userRequest.toString();
    }

}
