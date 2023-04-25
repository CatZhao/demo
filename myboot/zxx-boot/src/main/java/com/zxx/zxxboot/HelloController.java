package com.zxx.zxxboot;

import com.zxx.ZxxService;
import com.zxx.zxxboot.bean.User;
import com.zxx.zxxboot.mapper.UserMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private ZxxService zxxService;

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/user/{name}")
    public List<User> getUsers(@PathVariable String name) {
        return userMapper.queryByName(name);
    }
    @GetMapping("/hello")
    public String hello(){
        return zxxService.test();
        //return "hello";
    }
}
