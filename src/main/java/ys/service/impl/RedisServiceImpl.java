package ys.service.impl;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import ys.service.RedisService;

@Service
public class RedisServiceImpl implements RedisService{
	
	@Autowired
	private RedisTemplate<String, String> redisTemplateString;
	
	public void set(String key, String val){
		redisTemplateString.opsForValue().set(key,val);// 这个过期时间是默认的吗?
	}

	@Override
	public String get(String key) {
		return redisTemplateString.opsForValue().get(key);
	}  
	
	
}
