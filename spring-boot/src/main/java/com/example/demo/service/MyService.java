package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;

@Service
public class MyService {
	@Autowired
	private UserMapper mapper;
	
	//@Cacheable(value="findAll") //开始缓存  设置缓存的名称
	public List<User> findAll(){
		System.out.println("如果没有这句话说明进入了缓存");
		return mapper.findAll();
	}
}
