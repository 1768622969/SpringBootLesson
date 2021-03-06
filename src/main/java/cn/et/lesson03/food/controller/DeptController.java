package cn.et.lesson03.food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.et.lesson03.food.entity.TreeNode;
import cn.et.lesson03.food.service.DeptService;

@Controller
public class DeptController {
	@Autowired
	DeptService service;
	@ResponseBody
	@RequestMapping("/queryDept")
	public List<TreeNode> queryStudent(Integer id){
		if(id==null){
			id=0;
		}
		return service.queryTreeNode(id);
	}
}
