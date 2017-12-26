package cn.powersystem.entity;

public class Ps_systemconfig {
	//系统配置表(ps_systemconfig) 
	private int id;
	private int configValueId;//具体配置类型的配置参数ID
	private int isStart;//是否启用（1、启用 0、 未启用）
	private String configCode;//配置类型编码1、TASK_STATUS 2、RUNNING_STATUS 3、DOC_TYPE 4、BUG_LEVEL 5、BUG_TYPE 6、SOLVETASK_STATUS
	private String configName;//配置类型名称（1、任务状态2、运行状态3、工作单据类型4、缺陷等级5、缺陷类型）
	private String configValueName;//具体配置类型的配置参数NAME
	private String DESC;//描述      此字段是关键字 操作时注意
	
	public Ps_systemconfig(int id, int configValueId, int isStart,
			String configCode, String configName, String configValueName,
			String dESC) {
		super();
		this.id = id;
		this.configValueId = configValueId;
		this.isStart = isStart;
		this.configCode = configCode;
		this.configName = configName;
		this.configValueName = configValueName;
		DESC = dESC;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getConfigValueId() {
		return configValueId;
	}
	public void setConfigValueId(int configValueId) {
		this.configValueId = configValueId;
	}
	public int getIsStart() {
		return isStart;
	}
	public void setIsStart(int isStart) {
		this.isStart = isStart;
	}
	public String getConfigCode() {
		return configCode;
	}
	public void setConfigCode(String configCode) {
		this.configCode = configCode;
	}
	public String getConfigName() {
		return configName;
	}
	public void setConfigName(String configName) {
		this.configName = configName;
	}
	public String getConfigValueName() {
		return configValueName;
	}
	public void setConfigValueName(String configValueName) {
		this.configValueName = configValueName;
	}
	public String getDESC() {
		return DESC;
	}
	public void setDESC(String dESC) {
		DESC = dESC;
	}
	
	
}
