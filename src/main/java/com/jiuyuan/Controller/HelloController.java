package com.jiuyuan.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shkstart
 * @create 2021-08-14 14:09
 */
@RestController
public class HelloController {
    @GetMapping("hello")
    public String hello(){
        System.out.println("hello");
        return "hello";
    }
}
