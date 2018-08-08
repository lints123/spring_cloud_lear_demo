package com.service.ribbon.controller;

import com.service.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonControler {
    @Autowired
    RibbonService ribbonService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam(value = "name", defaultValue = "lints")String name) {
        return ribbonService.hiService( name );
    }
}
