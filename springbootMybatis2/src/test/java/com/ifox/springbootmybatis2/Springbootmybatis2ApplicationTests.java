package com.ifox.springbootmybatis2;

import com.ifox.springbootmybatis2.entity.User;
import com.ifox.springbootmybatis2.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springbootmybatis2ApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void contextLoads() {
		userMapper.insert("zhongchao","123456","123456789");
		User user = userMapper.findUserByPhone("123456789");
		Assert.assertEquals("zhongchao",user.getName());
	}

}
