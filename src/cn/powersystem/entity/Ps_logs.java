package cn.powersystem.entity;

public class Ps_logs {
	private int id;
	private String userCode;//用户账号（来源于ps_user中的userCode）
	private String username;//用户姓名（来源于ps_user中的userName）
	private String operateInfo;//操作信息
	private double operateDatetime;//操作时间
	
	public Ps_logs(int id, String userCode, String username,
			String operateInfo, double operateDatetime) {
		super();
		this.id = id;
		this.userCode = userCode;
		this.username = username;
		this.operateInfo = operateInfo;
		this.operateDatetime = operateDatetime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getOperateInfo() {
		return operateInfo;
	}
	public void setOperateInfo(String operateInfo) {
		this.operateInfo = operateInfo;
	}
	public double getOperateDatetime() {
		return operateDatetime;
	}
	public void setOperateDatetime(double operateDatetime) {
		this.operateDatetime = operateDatetime;
	} 
	
}
