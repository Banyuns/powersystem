package cn.powersystem.entity;

import java.util.Date;

public class Ps_inspectiontask_detail {
	//巡检任务子表(ps_inspectiontask_detail) 
	private int id;
	private int taskId;//主表任务ID
	private int taskStatus;//任务状态ID
	private int poleId;//杆塔ID
	private String poleCode;//杆塔CODE
	private String lineCode;//线路编号
	private String lineName;//线路名称
	private int isBug;//有无缺陷/故障（1、有，0、无）默认为0
	private double intactRate;//完好率
	private int bugLevel;//缺陷级别ID(来源于系统配置表ps_systemconfig中configCode =’BUG_LEVEL’的configValueId）
	private String bugLevelName;//缺陷级别NAME(来源于系统配置表ps_systemconfig中configCode =’BUG_LEVEL’的configValueName）
	private int bugType;//缺陷类型ID(来源于系统配置表ps_systemconfig中configCode =’BUG_TYPE’的configValueId）
	private String bugTypeName;//缺陷类型NAME(来源于系统配置表ps_systemconfig中configCode =’BUG_TYPE’的configValueName）
	private String bugDesc;//缺陷描述
	private String discovererCode;//发现人CODE
	private String discovererName;//发现人NAME
	private Date discoverTime;//发现时间
	private int isSolve;//是否消缺（1、是，0、否）默认为0
	private int isBugLevel;//是否确定缺陷级别（1、是，0、否）默认为0
	private Date inspectTime;//巡检时间
	private Date creationTime;//创建时间
	private String createdBy;//创建者
	private Date lastUpdateTime;//最后修改时间
	
	public Ps_inspectiontask_detail(int id, int taskId, int taskStatus,
			int poleId, String poleCode, String lineCode, String lineName,
			int isBug, double intactRate, int bugLevel, String bugLevelName,
			int bugType, String bugTypeName, String bugDesc,
			String discovererCode, String discovererName, Date discoverTime,
			int isSolve, int isBugLevel, Date inspectTime, Date creationTime,
			String createdBy, Date lastUpdateTime) {
		super();
		this.id = id;
		this.taskId = taskId;
		this.taskStatus = taskStatus;
		this.poleId = poleId;
		this.poleCode = poleCode;
		this.lineCode = lineCode;
		this.lineName = lineName;
		this.isBug = isBug;
		this.intactRate = intactRate;
		this.bugLevel = bugLevel;
		this.bugLevelName = bugLevelName;
		this.bugType = bugType;
		this.bugTypeName = bugTypeName;
		this.bugDesc = bugDesc;
		this.discovererCode = discovererCode;
		this.discovererName = discovererName;
		this.discoverTime = discoverTime;
		this.isSolve = isSolve;
		this.isBugLevel = isBugLevel;
		this.inspectTime = inspectTime;
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
	public int getTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(int taskStatus) {
		this.taskStatus = taskStatus;
	}
	public int getPoleId() {
		return poleId;
	}
	public void setPoleId(int poleId) {
		this.poleId = poleId;
	}
	public String getPoleCode() {
		return poleCode;
	}
	public void setPoleCode(String poleCode) {
		this.poleCode = poleCode;
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
	public int getIsBug() {
		return isBug;
	}
	public void setIsBug(int isBug) {
		this.isBug = isBug;
	}
	public double getIntactRate() {
		return intactRate;
	}
	public void setIntactRate(double intactRate) {
		this.intactRate = intactRate;
	}
	public int getBugLevel() {
		return bugLevel;
	}
	public void setBugLevel(int bugLevel) {
		this.bugLevel = bugLevel;
	}
	public String getBugLevelName() {
		return bugLevelName;
	}
	public void setBugLevelName(String bugLevelName) {
		this.bugLevelName = bugLevelName;
	}
	public int getBugType() {
		return bugType;
	}
	public void setBugType(int bugType) {
		this.bugType = bugType;
	}
	public String getBugTypeName() {
		return bugTypeName;
	}
	public void setBugTypeName(String bugTypeName) {
		this.bugTypeName = bugTypeName;
	}
	public String getBugDesc() {
		return bugDesc;
	}
	public void setBugDesc(String bugDesc) {
		this.bugDesc = bugDesc;
	}
	public String getDiscovererCode() {
		return discovererCode;
	}
	public void setDiscovererCode(String discovererCode) {
		this.discovererCode = discovererCode;
	}
	public String getDiscovererName() {
		return discovererName;
	}
	public void setDiscovererName(String discovererName) {
		this.discovererName = discovererName;
	}
	public Date getDiscoverTime() {
		return discoverTime;
	}
	public void setDiscoverTime(Date discoverTime) {
		this.discoverTime = discoverTime;
	}
	public int getIsSolve() {
		return isSolve;
	}
	public void setIsSolve(int isSolve) {
		this.isSolve = isSolve;
	}
	public int getIsBugLevel() {
		return isBugLevel;
	}
	public void setIsBugLevel(int isBugLevel) {
		this.isBugLevel = isBugLevel;
	}
	public Date getInspectTime() {
		return inspectTime;
	}
	public void setInspectTime(Date inspectTime) {
		this.inspectTime = inspectTime;
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
