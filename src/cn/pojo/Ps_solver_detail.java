package entity;

import java.util.Date;

public class Ps_solver_detail {
	//消缺任务-消缺员明细表(ps_solver_detail)
	private int id;
	private int taskId;//主表任务ID
	private String solverCode;//消缺员CODE
	private String solverName;//消缺员名称
	private String createdBy;//创建者
	private Date creationTime;//创建时间
	private Date lastUpdateTime;//最后修改时间
	
	public Ps_solver_detail(int id, int taskId, String solverCode,
			String solverName, String createdBy, Date creationTime,
			Date lastUpdateTime) {
		super();
		this.id = id;
		this.taskId = taskId;
		this.solverCode = solverCode;
		this.solverName = solverName;
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
	public String getSolverCode() {
		return solverCode;
	}
	public void setSolverCode(String solverCode) {
		this.solverCode = solverCode;
	}
	public String getSolverName() {
		return solverName;
	}
	public void setSolverName(String solverName) {
		this.solverName = solverName;
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
