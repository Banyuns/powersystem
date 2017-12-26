package cn.powersystem.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.Request;

import cn.powersystem.dao.UserMapper;
import cn.powersystem.entity.Ps_user;
import cn.powersystem.service.UserService;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")//去除警告
public class UserAction extends ActionSupport {
	
	public UserService userService;
	

	public UserService getUserService() {
		return userService;
	}


	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String showUserAll(){
		System.out.println("��Һ�");
		 ActionContext actionContext = ActionContext.getContext();  
	      Map session = actionContext.getSession();  
		List<Ps_user> lists=userService.userList();
		System.err.println(lists.size());
		session.put("userlist", lists);
		if(lists.size()>0){
			return "yes";
		}else{
			return "no";
		}
	
	}

	
}
