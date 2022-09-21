package com.fx.controller;

import com.fx.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;
import java.io.IOException;

@Controller
public class AjaxController {
    @RequestMapping("/test/ajax")
    public void testAjax(Integer id, @RequestBody String requestBody, HttpServletResponse response) throws IOException {
        System.out.println("requestBody = " + requestBody);
        System.out.println("id = " + id);
        response.getWriter().write("hello,axios");
    }

    @RequestMapping("/test/RequestBody/json")
    public void testRequestBody(@RequestBody User user, HttpServletResponse response) throws IOException {
        System.out.println(user);
        response.getWriter().write("hello,requestBody");

    }

    @RequestMapping("/test/ResponseBody")
    @ResponseBody
    public String testResponseBody(){
        return "success";
    }

    @RequestMapping("/test/ResponseBody/json")
    @ResponseBody
    public User testResponseBodyJson(){
        User user = new User(1111,"admin","111111",18,"女");
        return user;
    }

}
