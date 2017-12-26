package cn.powersystem.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.powersystem.dao.UserMapper;
import cn.powersystem.entity.Ps_user;

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



	public List<Ps_user> userList() {
		return userDao.userList();
	}

}
