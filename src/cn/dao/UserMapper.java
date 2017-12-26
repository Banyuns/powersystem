package cn.dao;

import java.util.List;

import cn.pojo.testuser;

public interface UserMapper {
	//查询信息
	List<testuser> userList();
}
