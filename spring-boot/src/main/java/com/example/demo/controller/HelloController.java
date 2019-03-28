package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.RedisUtil;
import com.example.demo.domain.User;
import com.example.demo.service.MyService;

@RestController
public class HelloController {
	
	@Autowired
	private MyService service;
	
	@Autowired
	private RedisUtil  cluster;
	@RequestMapping("hello")
	//@Cacheable(value="hello")
	public String hello() {
		cluster.set("name", "哈哈");
		String value = cluster.get("name")+"";
		return value;
	}
	
	@RequestMapping("findall")  
	public List<User> findall() {
		return service.findAll();
	}
}
