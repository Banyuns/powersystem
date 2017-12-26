package entity;

import java.util.Date;

public class Ps_user {
	private int id; //必填，主键ID
	private int age;//年龄
	private String userCode; //用户账号
	private String userName;//用户姓名
	private String userPassword;//用户登录密码 
	private String sex;//性别
	private String phoneTel;//联系电话
	private String email;//电子邮箱
	private Date entryDate;//入职日期
	private Date dimissionDate;//离职日期
	private Date creationTime;//注册时间
	private Date lastLoginTime;//最后登录时间
	private Date lastUpdateTime;//最后修改时间
	private int userStatus; //使用状态（1为正常0为冻结）
	private int roleId;//所属角色ID（来源于ps_role中的主键ID）
	private String createdBy;//创建者
	
	public Ps_user(int id, int age, String userCode, String userName,
			String userPassword, String sex, String phoneTel, String email,
			Date entryDate, Date dimissionDate, Date creationTime,
			Date lastLoginTime, Date lastUpdateTime, int userStatus,
			int roleId, String createdBy) {
		super();
		this.id = id;
		this.age = age;
		this.userCode = userCode;
		this.userName = userName;
		this.userPassword = userPassword;
		this.sex = sex;
		this.phoneTel = phoneTel;
		this.email = email;
		this.entryDate = entryDate;
		this.dimissionDate = dimissionDate;
		this.creationTime = creationTime;
		this.lastLoginTime = lastLoginTime;
		this.lastUpdateTime = lastUpdateTime;
		this.userStatus = userStatus;
		this.roleId = roleId;
		this.createdBy = createdBy;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhoneTel() {
		return phoneTel;
	}
	public void setPhoneTel(String phoneTel) {
		this.phoneTel = phoneTel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}
	public Date getDimissionDate() {
		return dimissionDate;
	}
	public void setDimissionDate(Date dimissionDate) {
		this.dimissionDate = dimissionDate;
	}
	public Date getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}
	public Date getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public int getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	 
	
}
