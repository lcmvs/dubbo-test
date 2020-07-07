package com.lcm.test.dubbo.bootdubboprovider.service.impl;

import com.lcm.test.dubbo.bootdubboprovider.service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @description:
 * @author: lcm
 * @create: 2020-07-07 14:49
 **/
@DubboService
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        return "hi "+name;
    }

}
