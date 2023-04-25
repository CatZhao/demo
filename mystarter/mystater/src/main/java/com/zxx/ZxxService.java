package com.zxx;

import org.springframework.stereotype.Service;

@Service
public class ZxxService {

    private String name;
    public ZxxService(ZxxProperties config) {
        this.name = config.getName();
    }

    public String test(){
        return "hello " + name;
    }
}
