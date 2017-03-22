package ys.cache;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ys.service.RedisService;

/**
 * Unit test for simple App.
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-context.xml" })
public class AppTest {
	
	@Autowired
	private RedisService redisService;
	
	@Test
	public void testSet(){
		redisService.set("name", "asa");
	}

	@Test
	public void testGet(){
		System.out.println(redisService.get("name"));
	}
	
}
