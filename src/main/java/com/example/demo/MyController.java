package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping("/demo")
@RequiredArgsConstructor
public class MyController {

    private final MyService myService;


    @GetMapping("/hello")
    public String sayHello() throws UnknownHostException {
        //return InetAddress.getLocalHost().getHostName();
        return myService.sayHello();
    }

}
