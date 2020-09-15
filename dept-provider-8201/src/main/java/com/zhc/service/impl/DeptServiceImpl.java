package com.zhc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhc.core.page.MybatisPageHelper;
import com.zhc.core.page.PageRequest;
import com.zhc.core.page.PageResult;

import com.zhc.model.Dept;
import com.zhc.dao.DeptMapper;
import com.zhc.service.DeptService;

/**
 * ---------------------------
 * 部门表 (DeptServiceImpl)
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2020-09-03 11:00:47
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptMapper deptMapper;

	@Override
	public int save(Dept record) {
		if(record.getId() == null || record.getId() == 0) {
			return deptMapper.add(record);
		}
		return deptMapper.update(record);
	}

	@Override
	public int delete(Dept record) {
		return deptMapper.delete(record.getId());
	}

	@Override
	public int delete(List<Dept> records) {
		for(Dept record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public Dept findById(Long id) {
		return deptMapper.findById(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return MybatisPageHelper.findPage(pageRequest, deptMapper);
	}

}
