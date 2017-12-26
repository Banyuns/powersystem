package cn.powersystem.dao;

import java.util.List;

import cn.powersystem.entity.Ps_user;


public interface UserMapper {
	//查询信息
	List<Ps_user> userList();
}
