package cn.powersystem.entity;

import java.util.Date;

public class Ps_pole_info {
	//杆塔信息表(ps_pole_info)
	private int id;
	private int lineId;//所属线路ID
	private int isStart;//是否启用（1、启用 0、停用）
	private String poleCode;//杆塔编号
	private String lineCode;//所属线路CODE
	private String lineName;//所属线路NAME
	private String createdBy;//创建者
	private Date creationTime;//创建时间
	private Date lastUpdateTime;//最后修改时间
	
	public Ps_pole_info(int id, int lineId, int isStart, String poleCode,
			String lineCode, String lineName, String createdBy,
			Date creationTime, Date lastUpdateTime) {
		super();
		this.id = id;
		this.lineId = lineId;
		this.isStart = isStart;
		this.poleCode = poleCode;
		this.lineCode = lineCode;
		this.lineName = lineName;
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
	public int getLineId() {
		return lineId;
	}
	public void setLineId(int lineId) {
		this.lineId = lineId;
	}
	public int getIsStart() {
		return isStart;
	}
	public void setIsStart(int isStart) {
		this.isStart = isStart;
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
