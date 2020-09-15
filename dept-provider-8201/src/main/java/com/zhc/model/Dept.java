package com.zhc.model;

/**
 * ---------------------------
 * 部门表 (Dept)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2020-09-03 11:00:47
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public class Dept {

	/** id */
	private Long id;
	/** 中间页名称 */
	private String name;
	/** 说明 */
	private String descript;
	/** 创建人ID */
	private Long createAuid;
	/** 创建人 */
	private String createName;
	/** 创建时间 */
	private java.util.Date createTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public Long getCreateAuid() {
		return createAuid;
	}

	public void setCreateAuid(Long createAuid) {
		this.createAuid = createAuid;
	}

	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}

	public java.util.Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}

}