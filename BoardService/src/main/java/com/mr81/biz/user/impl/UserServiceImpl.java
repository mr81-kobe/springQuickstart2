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
		System.out.println("회원가입 메소드 실행중");
		dao.insert_User(vo);
	}

	@Override
	public void delete_User(UserVO vo) {
		// TODO Auto-generated method stub
		System.out.println("회원 탈퇴 메소드 실행중");
		dao.delete_User(vo);
	}

	@Override
	public void update_User(UserVO vo) {
		// TODO Auto-generated method stub
		System.out.println("회원 정보 변경 메소드 실행중");
		dao.update_User(vo);
	}

	@Override
	public UserVO find_User(UserVO vo) {
		// TODO Auto-generated method stub
		System.out.println("회원 찾기 메소드 실행중");
		return dao.find_User(vo);
	}

	@Override
	public List<UserVO> find_All(UserVO vo) {
		// TODO Auto-generated method stub
		System.out.println("회원 리스트 찾기 메소드 실행중");
		return dao.find_All(vo);
	}

}
