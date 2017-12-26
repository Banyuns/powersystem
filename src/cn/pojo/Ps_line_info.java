package entity;

import java.util.Date;

public class Ps_line_info {
	//线路信息表(ps_line_info)
	private int id;
	private String lineCode;//线路编号
	private String lineName;//线路名称
	private double lineLength;//线路长度
	private double backLength;//回路长度
	private Date productDate;//投运时间
	private String voltageLevel;//电压等级
	private int startPole;//起始杆号ID
	private String startPoleCode;//起始杆号CODE
	private int endPole;//终止杆号ID
	private String endPoleCode;//终止杆号CODE
	private int towerBaseNum;//塔基数
	private String maintenanceCompany;//维修单位
	private int runningStatus;//运行状态id(来源于系统配置表ps_systemconfig中configCode =’RUNNING_STATUS’的configValueId）
	private String runningStatusName;//运行状态name(来源于系统配置表ps_systemconfig中configCode =’RUNNING_STATUS’的configValueName）
	private String common;//备注
	private Date creationTime;//创建时间
	private String createdBy;//创建者
	private Date lastUpdateTime;//最后修改时间
	private int isStart;//是否启用（1、启用 0、停用）
	
	public Ps_line_info(int id, String lineCode, String lineName,
			double lineLength, double backLength, Date productDate,
			String voltageLevel, int startPole, String startPoleCode,
			int endPole, String endPoleCode, int towerBaseNum,
			String maintenanceCompany, int runningStatus,
			String runningStatusName, String common, Date creationTime,
			String createdBy, Date lastUpdateTime, int isStart) {
		super();
		this.id = id;
		this.lineCode = lineCode;
		this.lineName = lineName;
		this.lineLength = lineLength;
		this.backLength = backLength;
		this.productDate = productDate;
		this.voltageLevel = voltageLevel;
		this.startPole = startPole;
		this.startPoleCode = startPoleCode;
		this.endPole = endPole;
		this.endPoleCode = endPoleCode;
		this.towerBaseNum = towerBaseNum;
		this.maintenanceCompany = maintenanceCompany;
		this.runningStatus = runningStatus;
		this.runningStatusName = runningStatusName;
		this.common = common;
		this.creationTime = creationTime;
		this.createdBy = createdBy;
		this.lastUpdateTime = lastUpdateTime;
		this.isStart = isStart;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public double getLineLength() {
		return lineLength;
	}
	public void setLineLength(double lineLength) {
		this.lineLength = lineLength;
	}
	public double getBackLength() {
		return backLength;
	}
	public void setBackLength(double backLength) {
		this.backLength = backLength;
	}
	public Date getProductDate() {
		return productDate;
	}
	public void setProductDate(Date productDate) {
		this.productDate = productDate;
	}
	public String getVoltageLevel() {
		return voltageLevel;
	}
	public void setVoltageLevel(String voltageLevel) {
		this.voltageLevel = voltageLevel;
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
	public int getTowerBaseNum() {
		return towerBaseNum;
	}
	public void setTowerBaseNum(int towerBaseNum) {
		this.towerBaseNum = towerBaseNum;
	}
	public String getMaintenanceCompany() {
		return maintenanceCompany;
	}
	public void setMaintenanceCompany(String maintenanceCompany) {
		this.maintenanceCompany = maintenanceCompany;
	}
	public int getRunningStatus() {
		return runningStatus;
	}
	public void setRunningStatus(int runningStatus) {
		this.runningStatus = runningStatus;
	}
	public String getRunningStatusName() {
		return runningStatusName;
	}
	public void setRunningStatusName(String runningStatusName) {
		this.runningStatusName = runningStatusName;
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
	public int getIsStart() {
		return isStart;
	}
	public void setIsStart(int isStart) {
		this.isStart = isStart;
	}
	


	
}
