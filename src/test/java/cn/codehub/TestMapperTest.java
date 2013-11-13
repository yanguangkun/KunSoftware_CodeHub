package cn.codehub;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.codehub.mapper.TestMapper;
import cn.codehub.page.PageInfo;
import cn.codehub.service.TestService;

@RunWith(value=SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext.xml")
public class TestMapperTest {

	@Autowired
	private TestMapper testMapper;
	
	@Autowired
	private TestService testService;
	
	
	@Test
	public void getStudentTest(){  

		//Test user = new Test();
		//user.setName("bb");
		//testMapper.insertUser(user);
		testService.addUser();
		
//		Test entity = testMapper.getUser("ss"); 
//		System.out.println(entity);
//		
		List<cn.codehub.entity.Test> list = testMapper.getUserList("ss");
//		
//		System.out.println(list.size());
//		
//		System.out.println(testService.getUser("ss"));
//		
//		
		PageInfo pageInfo = new PageInfo();
		pageInfo.setPageNo(2);
		
		list = testMapper.getUserListPage(pageInfo);
		System.out.println(list.size());
	}
}
