package com.hxk.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    @Value("${server.port}")
    String port;
//    public String hiService(String name)
//    {
//        return restTemplate.getForObject("http://SERVICE-CUSTOMER/hi?name=" + name, String.class);
////        return "hi " + name + ",i am from port:" + port;
//    }

    public String hiService(String name)
    {
        ResponseEntity forEntity = restTemplate.getForEntity("http://SERVICE-CUSTOMER/hi?name=" + name, String.class);
        Object forObject = restTemplate.getForObject("http://SERVICE-CUSTOMER/hi?name="+name, String.class);
        return forObject.toString();
    }

//    断路器配置，当无法调用方法时，自动调用hiError
//    @HystrixCommand(fallbackMethod = "hiError")
//    public String hiService(String name)
//    {
//        Object forObject = restTemplate.getForObject("http://SERVICE-CUSTOMER/hi?name=" + name, String.class);
//        return forObject.toString();
//    }
    public String hiError(String name){
        return "hey:"+name+", there is some problem with hi page";
    }

}