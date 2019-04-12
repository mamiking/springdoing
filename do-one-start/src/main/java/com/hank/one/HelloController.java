package com.hank.one;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${my.name}")
    private String name;

    @Value("${my.age}")
    private int age;

    //url route to /my
    @RequestMapping(value = "/my")
    public String myfun(){
        //输出配置文件中的用户名和年龄
        return "Hello,"+name+", Your age is "+age+"! welcome to java Spring world x!";
    }

    //url route to  /hi
    @RequestMapping(value = "/hi")
    public String Hifun(){
        return "Hello world.";
    }
}
