package cn.codehub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.codehub.entity.Test;
import cn.codehub.mapper.TestMapper;

@Service
public class TestService {

	//@Autowired 
	//private  HttpServletRequest request;
	
	@Autowired
	private TestMapper testMapper;
	
	@Transactional  
	public Test getUser(String name) {
		
		//String pageNo = request.getParameter("pageNo");
		return testMapper.getUser(name);
	}
	
	public void addUser() {
		Test user = new Test();
		user.setName("bb");
		testMapper.insertUser(user);
	}
}
