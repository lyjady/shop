package com.example.springbootdubboprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.springbootdubbointefaces.service.UserService;
import org.springframework.stereotype.Component;

/**
 * @author LinYongJin
 * @date 2019/12/1 16:06
 */
@Component
@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService{

    @Override
    public String hello(String name) {
        return "Hello Dubbo " + name;
    }
}
