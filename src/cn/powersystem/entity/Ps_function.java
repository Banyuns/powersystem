package cn.powersystem.entity;

import java.util.Date;

public class Ps_function {
	//功能表(ps_function) 
	private int id;
	private String functionCode;//功能编码
	private String functionName;//功能名称
	private Date creationTime;//创建日期
	private String createdBy;//创建人（来源ps_user表中userCode）
	private Date lastUpdateTime;//最新更新日期
	private String funcUrl;//功能访问URL
	private int parentId;//父节点（主功能父节点为0）
	private int isStart;//是否启用（1、启用0 未启用）
	
	
 
	public Ps_function(int id, String functionCode, String functionName,
			Date creationTime, String createdBy, Date lastUpdateTime,
			String funcUrl, int parentId, int isStart) {
		super();
		this.id = id;
		this.functionCode = functionCode;
		this.functionName = functionName;
		this.creationTime = creationTime;
		this.createdBy = createdBy;
		this.lastUpdateTime = lastUpdateTime;
		this.funcUrl = funcUrl;
		this.parentId = parentId;
		this.isStart = isStart;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFunctionCode() {
		return functionCode;
	}
	public void setFunctionCode(String functionCode) {
		this.functionCode = functionCode;
	}
	public String getFunctionName() {
		return functionName;
	}
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
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
	public String getFuncUrl() {
		return funcUrl;
	}
	public void setFuncUrl(String funcUrl) {
		this.funcUrl = funcUrl;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public int getIsStart() {
		return isStart;
	}
	public void setIsStart(int isStart) {
		this.isStart = isStart;
	}
	
	
}
