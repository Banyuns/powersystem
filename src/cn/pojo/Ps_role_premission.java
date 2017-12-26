package entity;

import java.util.Date;

public class Ps_role_premission {
	//功能权限表(ps_role_premission) 
	private int id;
	private int roleId;//必填，角色ID（来源于：ps_role表中的id
	private int functionCode;//必填，功能编码（来源于：ps_function表中的functionCode）
	private int isStart;//是否启用（1、启用0 未启用）
	private String createdBy;//创建人（来源ps_user表中userCode）
	private Date creationTime;//创建日期
	private Date lastUpdateTime;//最新更新日期
	
	public Ps_role_premission(int id, int roleId, int functionCode,
			int isStart, String createdBy, Date creationTime,
			Date lastUpdateTime) {
		super();
		this.id = id;
		this.roleId = roleId;
		this.functionCode = functionCode;
		this.isStart = isStart;
		this.createdBy = createdBy;
		this.creationTime = creationTime;
		this.lastUpdateTime = lastUpdateTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public int getFunctionCode() {
		return functionCode;
	}
	public void setFunctionCode(int functionCode) {
		this.functionCode = functionCode;
	}
	public int getIsStart() {
		return isStart;
	}
	public void setIsStart(int isStart) {
		this.isStart = isStart;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	
 
}
