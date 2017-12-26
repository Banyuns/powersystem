package cn.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.Request;

import cn.dao.UserMapper;
import cn.pojo.testuser;
import cn.service.UserService;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
@SuppressWarnings("serial")//åŽ»é™¤è­¦å‘Š
public class UserAction extends ActionSupport {
	
	public UserService userService;
	

	public UserService getUserService() {
		return userService;
	}


	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String showUserAll(){
		System.out.println("´ó¼ÒºÃ");
		 ActionContext actionContext = ActionContext.getContext();  
	      Map session = actionContext.getSession();  
		List<testuser> lists=userService.userList();
		System.err.println(lists.size());
		session.put("userlist", lists);
		if(lists.size()>0){
			return "yes";
		}else{
			return "no";
		}
	
	}

	
}
