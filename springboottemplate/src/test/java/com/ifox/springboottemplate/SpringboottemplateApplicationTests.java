package com.ifox.springboottemplate;

import com.ifox.springboottemplate.controller.HelloController;
import com.ifox.springboottemplate.domain.Uu;
import com.ifox.springboottemplate.domain.UuMapper;
import com.ifox.springboottemplate.service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(SpringboottemplateApplication.class)
@Transactional
public class SpringboottemplateApplicationTests {
	private Logger logger = Logger.getLogger(getClass());

	@Autowired
	private UserService userService;

	@Autowired
	private UuMapper uuMapper;


	private MockMvc mvc;

	@Before
	public void setUp() throws Exception {
		mvc = MockMvcBuilders.standaloneSetup(
				new HelloController()).build();
	}

	@Test
	public void getHello() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo("hello")));
	}

//	@Before
//	public void setUp(){
//		userService.deleteAllUsers();
//	}

	@Test
	public void test()throws Exception{
		userService.creat("a",1);
		userService.creat("b",2);
		userService.creat("c",3);
		userService.creat("d",4);
		userService.creat("e",5);

		Assert.assertEquals(5,userService.getAllUsers().intValue());

		userService.deleteByName("a");
		userService.deleteByName("b");

		Assert.assertEquals(3,userService.getAllUsers().intValue());
	}

	@Test
	@Rollback
	public void findByName()throws Exception{
		uuMapper.insert("aaa",20);
		Uu uu = uuMapper.findByName("aaa");
		Assert.assertEquals(20,uu.getAge().intValue());
	}

	@Test
	public void test1() throws Exception {
		logger.info("输出info");
		logger.debug("输出debug");
		logger.error("输出error");
	}
	@Test
	public void test2() throws Exception {
		logger.info("输出info");
		logger.debug("输出debug");
		logger.error("输出error");
	}
}
