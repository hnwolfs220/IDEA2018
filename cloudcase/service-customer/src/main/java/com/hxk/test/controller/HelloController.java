package com.hxk.test.controller;

import com.hxk.test.entity.User;
import com.hxk.test.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    @Autowired
    HelloService helloService;
    @Value("${server.port}")
    String port;


//    @RequestMapping(value = "/hi")
//    public String hi(@RequestParam String name)
//    {
//        return helloService.hiService(name);
//    }

    @RequestMapping(value = "/hi")
    public Object home(@RequestParam String name)
    {
        Map<String, Object> map = new HashMap<>();
        User user = new User(1, "hello-name");
        String s = "hi"+name + ", i am port:"+port;
        map.put("user", user);
        map.put("str", s);
        return map;
    }

}