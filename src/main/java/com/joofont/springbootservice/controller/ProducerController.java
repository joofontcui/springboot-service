package com.joofont.springbootservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cui jun on 2018/12/5.
 * @version 1.0
 */
@RestController
@RequestMapping("/feign")
public class ProducerController {

    @GetMapping("/v1/hello")
    public String hello(@RequestParam String name) {
        return "hello "+name+"，this is first messge";
    }

}
