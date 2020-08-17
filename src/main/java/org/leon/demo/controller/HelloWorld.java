package org.leon.demo.controller;

import com.example.demo.log.MyLog;
import com.example.demo.service.HelloworldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @Author: liyang27
 * @Date: 2020/8/11 14:36
 * @Description:
 */
@RestController
public class HelloWorld {
    @Autowired
    private HelloworldService helloworldService;

    @MyLog(desc = "打招呼")
    @RequestMapping("/sayHello")
    public String sayHello(){
        return helloworldService.sayHello();
    }
}
