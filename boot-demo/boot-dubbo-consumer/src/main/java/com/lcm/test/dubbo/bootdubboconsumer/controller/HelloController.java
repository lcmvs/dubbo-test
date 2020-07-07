package com.lcm.test.dubbo.bootdubboconsumer.controller;


import com.lcm.test.dubbo.bootdubboprovider.service.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: lcm
 * @create: 2020-07-07 16:59
 **/
@RestController
public class HelloController {

    @DubboReference
    HelloService helloService;

    @GetMapping("/hello")
    String hello(String name){
        return helloService.hello(name);
    }

}
