package com.mr81.biz.user;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.mr81.user.biz.UserService;
import com.mr81.user.biz.UserVO;

public class UserServiceClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext container = new GenericXmlApplicationContext("aplicationContext.xml"); 
		UserService service=(UserService) container.getBean("userServiceImpl");
		
		UserVO vo = new UserVO(); 
		vo.setId("13");
		vo.setName("»≤±‘¡ÿ");
		vo.setPassword("1234");
		vo.setRole("king");
		service.insert_User(vo);
		System.out.println(service.find_User(vo).toString());	
	}

}
