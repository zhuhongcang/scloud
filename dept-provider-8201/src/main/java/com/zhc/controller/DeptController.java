package com.zhc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zhc.core.http.HttpResult;
import com.zhc.core.page.PageRequest;

import com.zhc.model.Dept;
import com.zhc.service.DeptService;

/**
 * ---------------------------
 * 部门表 (DeptController)
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2020-09-03 11:00:47
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@RestController
@RequestMapping("dept")
public class DeptController {

	@Autowired
	private DeptService deptService;

	/**
	 * 保存部门表
	 * @param record
	 * @return
	 */
	@PostMapping(value="/save")
	public HttpResult save(@RequestBody Dept record) {
		return HttpResult.ok(deptService.save(record));
	}

    /**
     * 删除部门表
     * @param records
     * @return
     */
	@PostMapping(value="/delete")
	public HttpResult delete(@RequestBody List<Dept> records) {
		return HttpResult.ok(deptService.delete(records));
	}

    /**
     * 基础分页查询
     * @param pageRequest
     * @return
     */
	@PostMapping(value="/findPage")
	public HttpResult findPage(@RequestBody PageRequest pageRequest) {
		return HttpResult.ok(deptService.findPage(pageRequest));
	}

    /**
     * 根据主键查询
     * @param id
     * @return
     */
	@GetMapping(value="/findById")
	public HttpResult findById(@RequestParam Long id) {
		return HttpResult.ok(deptService.findById(id));
	}
}
