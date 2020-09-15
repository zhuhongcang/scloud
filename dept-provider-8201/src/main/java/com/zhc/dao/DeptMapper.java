package com.zhc.dao;

import java.util.List;

import com.zhc.model.Dept;

/**
 * ---------------------------
 * 部门表 (DeptMapper)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2020-09-03 11:00:47
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public interface DeptMapper {

	/**
	 * 添加部门表
	 * @param record
	 * @return
	 */
    int add(Dept record);

    /**
     * 删除部门表
     * @param id
     * @return
     */
    int delete(Long id);
    
    /**
     * 修改部门表
     * @param record
     * @return
     */
    int update(Dept record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    Dept findById(Long id);

    /**
     * 基础分页查询
     * @param record
     * @return
     */    
    List<Dept> findPage();
    
}