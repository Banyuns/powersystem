package cn.powersystem.entity;

import java.util.Date;

public class Ps_inspector_detail {
	//巡检任务-巡检员明细表(ps_inspector_detail) 
	private int id;
	private int taskId;//主表任务ID
	private String inspectorCode;//巡检员CODE
	private String inspectorName;//巡检员名称
	private Date creationTime;//创建时间
	private String createdBy;//创建者
	private Date lastUpdateTime;//最后修改时间
	
	public Ps_inspector_detail(int id, int taskId, String inspectorCode,
			String inspectorName, Date creationTime, String createdBy,
			Date lastUpdateTime) {
		super();
		this.id = id;
		this.taskId = taskId;
		this.inspectorCode = inspectorCode;
		this.inspectorName = inspectorName;
		this.creationTime = creationTime;
		this.createdBy = createdBy;
		this.lastUpdateTime = lastUpdateTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public String getInspectorCode() {
		return inspectorCode;
	}
	public void setInspectorCode(String inspectorCode) {
		this.inspectorCode = inspectorCode;
	}
	public String getInspectorName() {
		return inspectorName;
	}
	public void setInspectorName(String inspectorName) {
		this.inspectorName = inspectorName;
	}
	public Date getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	
}
