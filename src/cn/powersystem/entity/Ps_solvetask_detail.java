package cn.powersystem.entity;

import java.util.Date;

public class Ps_solvetask_detail {
	//消缺任务子表(ps_solvetask_detail) 
	private int id;
	private int taskId;//主表任务ID
	private int inspectionTaskDelId;//巡检任务子表ID
	private String createdBy;//创建者
	private Date creationTime;//创建时间
	private Date lastUpdateTime;//最后修改时间
	
	public Ps_solvetask_detail(int id, int taskId, int inspectionTaskDelId,
			String createdBy, Date creationTime, Date lastUpdateTime) {
		super();
		this.id = id;
		this.taskId = taskId;
		this.inspectionTaskDelId = inspectionTaskDelId;
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
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public int getInspectionTaskDelId() {
		return inspectionTaskDelId;
	}
	public void setInspectionTaskDelId(int inspectionTaskDelId) {
		this.inspectionTaskDelId = inspectionTaskDelId;
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
