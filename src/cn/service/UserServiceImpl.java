package cn.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.dao.UserMapper;

import cn.pojo.testuser;
@Service
public class UserServiceImpl implements UserService {
		
	/*@Resource*/
	public UserMapper userDao;
	
	

	public UserMapper getUserDao() {
		return userDao;
	}



	public void setUserDao(UserMapper userDao) {
		this.userDao = userDao;
	}



	public List<testuser> userList() {
		return userDao.userList();
	}

}
