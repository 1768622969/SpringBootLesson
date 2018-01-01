package cn.et.lesson02.controller;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.et.lesson02.entity.Emp;
import cn.et.lesson02.mapper.EmpMapper;
/**
 * helloworld例子
 * @author Administrator
 *
 */
@RestController
public class SbController {

	@Autowired
	DataSource dataSource;
	@Autowired
	EmpMapper mapper;
	/**
	 * 使用springmvc的例子
	 * @return
	 */
	@RequestMapping("/sysoSource")
	public String hello(){
		return dataSource.toString();
	}
	
	@RequestMapping("/queryAll")
	public List<cn.et.lesson02.entity.Emp> queryAll(){
		return mapper.queryEmp();
	}
}
