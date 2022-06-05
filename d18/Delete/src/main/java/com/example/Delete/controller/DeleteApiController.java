<<<<<<< HEAD
package com.example.Delete.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DeleteApiController {

    @DeleteMapping("/delete/{userId}")
    public void delete(@PathVariable String userId, @RequestParam String account){
        System.out.println(userId);
        System.out.println(account);
    }
    //delete -> 리소스삭제 이므로 200 ok
}
=======
package com.example.Delete.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DeleteApiController {

    @DeleteMapping("/delete/{userId}")
    public void delete(@PathVariable String userId, @RequestParam String account){
        System.out.println(userId);
        System.out.println(account);
    }
    //delete -> 리소스삭제 이므로 200 ok
}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
