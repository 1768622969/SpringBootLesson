package cn.et.lesson03.food.service;

import java.util.List;

import cn.et.lesson03.food.entity.Emp;

public interface EmpService {

	/* (non-Javadoc)
	 * @see cn.et.lesson03.food.service.impl.StudentService#queryStudent(java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see cn.et.lesson03.food.service.impl.DeptService#queryTreeNode(java.lang.Integer)
	 */
	public abstract List<Emp> queryEmp(Integer id);

}