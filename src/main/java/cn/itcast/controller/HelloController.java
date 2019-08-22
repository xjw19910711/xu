package cn.itcast.controller;

import cn.itcast.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/*@Controller
@ResponseBody*/
@RestController
/*@Slf4j*/
public class HelloController {
    @Autowired
    private User user;

    //.@RequestMapping("/hello")
    @GetMapping("/hello")
    public String sayHello(){
        return "这是一个SpringBoot项目";
    }
}
