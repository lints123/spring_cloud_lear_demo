package com.service.ribbon.service.impl;

import com.service.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class RibbonServiceImpl implements RibbonService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }
}
