<<<<<<< HEAD
package com.example.response.controller;


import com.example.response.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @RequestMapping("/main")
    public String main(){
        return "main.html";
    }

    @ResponseBody
    @GetMapping("/user")
    public User user(){
        var user = new User();
        user.setName("tomas");
        user.setAddress("fastcampus");
        return user;
    }

}
=======
package com.example.response.controller;


import com.example.response.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @RequestMapping("/main")
    public String main(){
        return "main.html";
    }

    @ResponseBody
    @GetMapping("/user")
    public User user(){
        var user = new User();
        user.setName("tomas");
        user.setAddress("fastcampus");
        return user;
    }

}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
