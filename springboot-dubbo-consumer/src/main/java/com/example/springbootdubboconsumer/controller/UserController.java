package com.example.springbootdubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.springbootdubbointefaces.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LinYongJin
 * @date 2019/12/1 16:12
 */
@RestController
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/dubbo")
    public String dubbo(String name) {
        return userService.hello(name);
    }
}
