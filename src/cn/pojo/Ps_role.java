package entity;

import java.util.Date;

public class Ps_role {
	//角色表( ps_role)
	private int id;
	private int isStart;
	private String roleName;
	private String createdBy;
	private Date creationTime;
	private Date lastUpdateTime;
	
	public Ps_role(int id, int isStart, String roleName, String createdBy,
			Date creationTime, Date lastUpdateTime) {
		super();
		this.id = id;
		this.isStart = isStart;
		this.roleName = roleName;
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
	public int getIsStart() {
		return isStart;
	}
	public void setIsStart(int isStart) {
		this.isStart = isStart;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
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
