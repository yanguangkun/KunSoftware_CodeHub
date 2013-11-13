package cn.codehub.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.codehub.page.PageInfo;
import cn.codehub.service.TestService;

@Controller 
@RequestMapping("/news")
public class TestController {

private static Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	private TestService testService;
	
	@RequestMapping("/list")
	public String contactList(ModelMap model,PageInfo pageInfo) { 
		logger.info("客户列表");
		testService.addUser(); 
		return "test";
	}	
}
