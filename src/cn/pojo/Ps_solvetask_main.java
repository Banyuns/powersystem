package entity;

import java.util.Date;

public class Ps_solvetask_main {
	//消缺任务主表(ps_solvetask_main) 
	private int id;
	private int workDocType;//工作单据ID(来源于：系统配置表ps_systemconfig中configCode = ‘DOC_TYPE’的configValueId)
	private int taskStatus;//任务状态ID(来源于系统配置表ps_systemconfig中configCode =’SLOVETASK_STATUS’的configValueId）
	private String solveTaskCode;//消缺任务编号
	private String solveTaskName;//消缺任务名称
	private String workDocTypeName;//工作单据NAME(来源于：系统配置表ps_systemconfig中configCode = ‘DOC_TYPE’的configValueName)
	private String taskDesc;//任务描述
	private String taskManagerCode;//任务负责人CODE
	private String taskManagerName;//任务负责人NAME
	private String taskStatusName;//任务状态名称(来源于系统配置表ps_systemconfig中configCode =’SLOVETASK_STATUS’的configValueName）
	private String common;//备注
	private String managerSuggestion;//负责人审查意见
	private String taskFinishDesc;//完成情况描述
	private String taskFinishReport;//工作终结报告
	private String taskNotes;//工作间断延期记载
	private String issuedByCode;//下发人CODE
	private String issuedByName;//下发人NAME
	private Date finishTime;//任务完成时间
	private Date issuedTime;//任务下发时间
	private Date creationTime;//创建时间
	private Date lastUpdateTime;//最后修改时间
	private int isCancel;//是否取消（1、是 0、否）默认为0
	private String issuedSuggestion;//下发人审查意见
	private String createdBy;//创建者
	
	public Ps_solvetask_main(int id, int workDocType, int taskStatus,
			String solveTaskCode, String solveTaskName, String workDocTypeName,
			String taskDesc, String taskManagerCode, String taskManagerName,
			String taskStatusName, String common, String managerSuggestion,
			String taskFinishDesc, String taskFinishReport, String taskNotes,
			String issuedByCode, String issuedByName, Date finishTime,
			Date issuedTime, Date creationTime, Date lastUpdateTime,
			int isCancel, String issuedSuggestion, String createdBy) {
		super();
		this.id = id;
		this.workDocType = workDocType;
		this.taskStatus = taskStatus;
		this.solveTaskCode = solveTaskCode;
		this.solveTaskName = solveTaskName;
		this.workDocTypeName = workDocTypeName;
		this.taskDesc = taskDesc;
		this.taskManagerCode = taskManagerCode;
		this.taskManagerName = taskManagerName;
		this.taskStatusName = taskStatusName;
		this.common = common;
		this.managerSuggestion = managerSuggestion;
		this.taskFinishDesc = taskFinishDesc;
		this.taskFinishReport = taskFinishReport;
		this.taskNotes = taskNotes;
		this.issuedByCode = issuedByCode;
		this.issuedByName = issuedByName;
		this.finishTime = finishTime;
		this.issuedTime = issuedTime;
		this.creationTime = creationTime;
		this.lastUpdateTime = lastUpdateTime;
		this.isCancel = isCancel;
		this.issuedSuggestion = issuedSuggestion;
		this.createdBy = createdBy;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getWorkDocType() {
		return workDocType;
	}
	public void setWorkDocType(int workDocType) {
		this.workDocType = workDocType;
	}
	public int getTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(int taskStatus) {
		this.taskStatus = taskStatus;
	}
	public String getSolveTaskCode() {
		return solveTaskCode;
	}
	public void setSolveTaskCode(String solveTaskCode) {
		this.solveTaskCode = solveTaskCode;
	}
	public String getSolveTaskName() {
		return solveTaskName;
	}
	public void setSolveTaskName(String solveTaskName) {
		this.solveTaskName = solveTaskName;
	}
	public String getWorkDocTypeName() {
		return workDocTypeName;
	}
	public void setWorkDocTypeName(String workDocTypeName) {
		this.workDocTypeName = workDocTypeName;
	}
	public String getTaskDesc() {
		return taskDesc;
	}
	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}
	public String getTaskManagerCode() {
		return taskManagerCode;
	}
	public void setTaskManagerCode(String taskManagerCode) {
		this.taskManagerCode = taskManagerCode;
	}
	public String getTaskManagerName() {
		return taskManagerName;
	}
	public void setTaskManagerName(String taskManagerName) {
		this.taskManagerName = taskManagerName;
	}
	public String getTaskStatusName() {
		return taskStatusName;
	}
	public void setTaskStatusName(String taskStatusName) {
		this.taskStatusName = taskStatusName;
	}
	public String getCommon() {
		return common;
	}
	public void setCommon(String common) {
		this.common = common;
	}
	public String getManagerSuggestion() {
		return managerSuggestion;
	}
	public void setManagerSuggestion(String managerSuggestion) {
		this.managerSuggestion = managerSuggestion;
	}
	public String getTaskFinishDesc() {
		return taskFinishDesc;
	}
	public void setTaskFinishDesc(String taskFinishDesc) {
		this.taskFinishDesc = taskFinishDesc;
	}
	public String getTaskFinishReport() {
		return taskFinishReport;
	}
	public void setTaskFinishReport(String taskFinishReport) {
		this.taskFinishReport = taskFinishReport;
	}
	public String getTaskNotes() {
		return taskNotes;
	}
	public void setTaskNotes(String taskNotes) {
		this.taskNotes = taskNotes;
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
	public Date getFinishTime() {
		return finishTime;
	}
	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}
	public Date getIssuedTime() {
		return issuedTime;
	}
	public void setIssuedTime(Date issuedTime) {
		this.issuedTime = issuedTime;
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
	public int getIsCancel() {
		return isCancel;
	}
	public void setIsCancel(int isCancel) {
		this.isCancel = isCancel;
	}
	public String getIssuedSuggestion() {
		return issuedSuggestion;
	}
	public void setIssuedSuggestion(String issuedSuggestion) {
		this.issuedSuggestion = issuedSuggestion;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
}
