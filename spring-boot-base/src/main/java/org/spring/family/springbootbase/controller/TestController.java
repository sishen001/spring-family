package org.spring.family.springbootbase.controller;
import com.example.springmodel.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private Users users;

    @RequestMapping("tempUrl")
    public String test(){
        System.out.println("nihao"+users.getName());
        return "OK";
    }
}
