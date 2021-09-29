package com.mr81.biz.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mr81.user.biz.UserService;
import com.mr81.user.biz.UserVO;
@Service
public class UserServiceImpl implements UserService{

	public UserServiceImpl() {
		// TODO Auto-generated constructor stub
	} 
	@Autowired
	private	UserDAO dao ;

	@Override
	public void insert_User(UserVO vo) { 
		// TODO Auto-generated method stub 
		System.out.println("ȸ������ �޼ҵ� ������");
		dao.insert_User(vo);
	}

	@Override
	public void delete_User(UserVO vo) {
		// TODO Auto-generated method stub
		System.out.println("ȸ�� Ż�� �޼ҵ� ������");
		dao.delete_User(vo);
	}

	@Override
	public void update_User(UserVO vo) {
		// TODO Auto-generated method stub
		System.out.println("ȸ�� ���� ���� �޼ҵ� ������");
		dao.update_User(vo);
	}

	@Override
	public UserVO find_User(UserVO vo) {
		// TODO Auto-generated method stub
		System.out.println("ȸ�� ã�� �޼ҵ� ������");
		return dao.find_User(vo);
	}

	@Override
	public List<UserVO> find_All(UserVO vo) {
		// TODO Auto-generated method stub
		System.out.println("ȸ�� ����Ʈ ã�� �޼ҵ� ������");
		return dao.find_All(vo);
	}

}
