package cn.powersystem.service;

import java.util.List;

import cn.powersystem.entity.Ps_user;


public interface UserService {
	
	//查询信息
	public List<Ps_user> userList();
}
