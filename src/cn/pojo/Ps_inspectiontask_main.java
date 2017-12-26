package entity;

import java.util.Date;

public class Ps_inspectiontask_main {
	//巡检任务主表
	private int id;//
	private int ps_id;//巡检任务编号
	private String inspectionTaskCode;//巡检任务编号
	private String inspectionTaskName;//巡检任务名称
	private int lineId;//所属线路ID
	private String lineCode;//所属线路CODE
	private String lineName;//所属线路NAME
	private int startPole;//起始杆号ID
	private String startPoleCode;//起始杆号CODE
	private int endPole;//终止杆号ID
	private String endPoleCode;//终止杆号CODE
	private String issuedByCode;//下发人CODE
	private String issuedByName;//下发人NAME
	private Date issuedTime;//任务下发时间
	private int taskStatus;//任务状态ID(来源于系统配置表ps_systemconfig中configCode =’TASK_STATUS’的configValueId）
	private String taskStatusName;//任务状态名称(来源于系统配置表ps_systemconfig中configCode =’TASK_STATUS’的configValueName）
	private Date finishTime;//任务完成时间
	private int isCancel;//是否取消（1、是 0、否）默认为0
	private String common;//备注 
	private Date creationTime;//创建时间
	private String createdBy;//创建者
	private Date lastUpdateTime;//最后修改时间
	
	public Ps_inspectiontask_main(int id, int ps_id, String inspectionTaskCode,
			String inspectionTaskName, int lineId, String lineCode,
			String lineName, int startPole, String startPoleCode, int endPole,
			String endPoleCode, String issuedByCode, String issuedByName,
			Date issuedTime, int taskStatus, String taskStatusName,
			Date finishTime, int isCancel, String common, Date creationTime,
			String createdBy, Date lastUpdateTime) {
		super();
		this.id = id;
		this.ps_id = ps_id;
		this.inspectionTaskCode = inspectionTaskCode;
		this.inspectionTaskName = inspectionTaskName;
		this.lineId = lineId;
		this.lineCode = lineCode;
		this.lineName = lineName;
		this.startPole = startPole;
		this.startPoleCode = startPoleCode;
		this.endPole = endPole;
		this.endPoleCode = endPoleCode;
		this.issuedByCode = issuedByCode;
		this.issuedByName = issuedByName;
		this.issuedTime = issuedTime;
		this.taskStatus = taskStatus;
		this.taskStatusName = taskStatusName;
		this.finishTime = finishTime;
		this.isCancel = isCancel;
		this.common = common;
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
	public int getPs_id() {
		return ps_id;
	}
	public void setPs_id(int ps_id) {
		this.ps_id = ps_id;
	}
	public String getInspectionTaskCode() {
		return inspectionTaskCode;
	}
	public void setInspectionTaskCode(String inspectionTaskCode) {
		this.inspectionTaskCode = inspectionTaskCode;
	}
	public String getInspectionTaskName() {
		return inspectionTaskName;
	}
	public void setInspectionTaskName(String inspectionTaskName) {
		this.inspectionTaskName = inspectionTaskName;
	}
	public int getLineId() {
		return lineId;
	}
	public void setLineId(int lineId) {
		this.lineId = lineId;
	}
	public String getLineCode() {
		return lineCode;
	}
	public void setLineCode(String lineCode) {
		this.lineCode = lineCode;
	}
	public String getLineName() {
		return lineName;
	}
	public void setLineName(String lineName) {
		this.lineName = lineName;
	}
	public int getStartPole() {
		return startPole;
	}
	public void setStartPole(int startPole) {
		this.startPole = startPole;
	}
	public String getStartPoleCode() {
		return startPoleCode;
	}
	public void setStartPoleCode(String startPoleCode) {
		this.startPoleCode = startPoleCode;
	}
	public int getEndPole() {
		return endPole;
	}
	public void setEndPole(int endPole) {
		this.endPole = endPole;
	}
	public String getEndPoleCode() {
		return endPoleCode;
	}
	public void setEndPoleCode(String endPoleCode) {
		this.endPoleCode = endPoleCode;
	}
	public String getIssuedByCode() {
		return issuedByCode;
	}
	public void setIssuedByCode(String issuedByCode) {
		this.issuedByCode = issuedByCode;
	}
	public String getIssuedByName() {
		return issuedByName;
	}
	public void setIssuedByName(String issuedByName) {
		this.issuedByName = issuedByName;
	}
	public Date getIssuedTime() {
		return issuedTime;
	}
	public void setIssuedTime(Date issuedTime) {
		this.issuedTime = issuedTime;
	}
	public int getTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(int taskStatus) {
		this.taskStatus = taskStatus;
	}
	public String getTaskStatusName() {
		return taskStatusName;
	}
	public void setTaskStatusName(String taskStatusName) {
		this.taskStatusName = taskStatusName;
	}
	public Date getFinishTime() {
		return finishTime;
	}
	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}
	public int getIsCancel() {
		return isCancel;
	}
	public void setIsCancel(int isCancel) {
		this.isCancel = isCancel;
	}
	public String getCommon() {
		return common;
	}
	public void setCommon(String common) {
		this.common = common;
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
