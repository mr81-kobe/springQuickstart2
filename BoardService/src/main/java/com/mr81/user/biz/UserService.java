package com.mr81.user.biz;

import java.util.List;

public interface UserService {

	public void insert_User(UserVO vo);
	
	public void delete_User(UserVO vo); 
	public void update_User(UserVO vo); 
	public UserVO find_User(UserVO vo);
	public List<UserVO> find_All(UserVO vo);
}
