package com.whitegive.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: chenz  2022/09/21
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/jenkins")
    public String jenkins(){
        return "holle jenkins---疯狂星期四V250";
    }

}
