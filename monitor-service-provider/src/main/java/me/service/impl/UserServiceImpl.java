package me.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import me.model.CPU;
import me.model.UserEntity;
import me.service.IUserService;
import me.utils.RedisCache;

public class UserServiceImpl implements IUserService {
	
	@Autowired RedisCache rc;

	@Override
	public UserEntity queryUserEntity() {
		
		UserEntity userEntity = new UserEntity();
		
		userEntity.setPassword("123456");
		userEntity.setUserId(123);
		userEntity.setUserName("18320928860");
		
		//
		
//		CPU cpu=new CPU();
//		cpu.addToRedis(rc);
//		
		
		
		return userEntity;
	}
	
	

}
