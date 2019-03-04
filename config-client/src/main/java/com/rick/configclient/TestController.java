package com.rick.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {

//    @Value("${foo}")
//    String foo;
//
//    @Value("${democonfigclient.message}")
//    String message;

//    @Value("${zuul.routes.api-a-url.path}")
//    String zuul;

    @Value("${name}")
    String name;

    @Value("${age}")
    Integer age;


//    @RequestMapping(value = "/hi")
//    public String hi(){
//        return foo;
//    }
//
//    @RequestMapping(value = "/hello")
//    public String hello(){
//        return message;
//    }

    @RequestMapping(value = "/test")
    public String test(){
        return name + " | "+ age;
    }


}
