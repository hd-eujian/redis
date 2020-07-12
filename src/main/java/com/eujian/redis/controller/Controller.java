package com.eujian.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class Controller {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("getkey")
    public String getkey(String key){
        String result = stringRedisTemplate.opsForValue().get(key);
        return result;
    }
}
