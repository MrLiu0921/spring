package com.example.demo.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.User;
//相当于dao
@Mapper  
public interface UserMapper {
	
	public List<User> findAll();

}
