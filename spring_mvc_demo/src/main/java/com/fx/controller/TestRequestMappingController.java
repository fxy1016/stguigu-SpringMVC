package com.fx.controller;

import com.fx.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestRequestMappingController {

    @RequestMapping("/hello")
    public String hello(){
        return "success";
    }

    @RequestMapping("/param/pojo")
    public String getParamByPojo(User user){

        System.out.println(user);
        return "success";
    }

}
