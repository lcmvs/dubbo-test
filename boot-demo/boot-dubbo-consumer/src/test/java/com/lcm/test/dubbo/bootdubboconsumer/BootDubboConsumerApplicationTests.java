package com.lcm.test.dubbo.bootdubboconsumer;

import com.lcm.test.dubbo.bootdubboprovider.service.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootDubboConsumerApplicationTests {

    @DubboReference(version = "1.0.0")
    HelloService helloService;
    
    @Test
    void contextLoads() {
        System.out.println(helloService.hello("lcm"));
    }

}
