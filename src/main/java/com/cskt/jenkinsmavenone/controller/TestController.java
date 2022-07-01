package com.cskt.jenkinsmavenone.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 10633
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "fff";
    }

}
