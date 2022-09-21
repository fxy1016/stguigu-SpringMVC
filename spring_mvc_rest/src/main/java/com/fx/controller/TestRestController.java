package com.fx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestRestController {

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getAllUser(){
        System.out.println("查询所有用户的信息-->/user-->get");
        return "success";
    }
    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public String getUserById(@PathVariable("id") Integer id){
        System.out.println("根据id查询用户的信息");
        return "success";
    }
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String insertUser(){
        System.out.println("添加用户信息");
        return "success";
    }

    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String uodateUser(){
        System.out.println("修改用户信息");
        return "success";
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable("id") Integer id){
        System.out.println("删除用户信息");
        return "success";
    }
}
