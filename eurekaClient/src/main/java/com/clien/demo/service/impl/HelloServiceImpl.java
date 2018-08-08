package com.clien.demo.service.impl;


import com.clien.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class HelloServiceImpl implements HelloService {

    @Value("${server.port}")
    String port;

    @Override
    public String hiService(String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}
