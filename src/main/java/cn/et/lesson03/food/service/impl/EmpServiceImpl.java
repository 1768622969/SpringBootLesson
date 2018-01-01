package cn.et.lesson03.food.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.et.lesson03.food.dao.EmpMapper;
import cn.et.lesson03.food.entity.Emp;
import cn.et.lesson03.food.entity.EmpExample;
import cn.et.lesson03.food.service.EmpService;
@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	EmpMapper em;
	/* (non-Javadoc)
	 * @see cn.et.lesson03.food.service.impl.StudentService#queryStudent(java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see cn.et.lesson03.food.service.impl.DeptService#queryTreeNode(java.lang.Integer)
	 */
	/* (non-Javadoc)
	 * @see cn.et.lesson03.food.service.impl.EmpService#queryEmp(java.lang.Integer)
	 */
	public List<Emp> queryEmp(Integer id){
		EmpExample ee=new EmpExample();
		if(id!=null)
			ee.createCriteria().andDeptidEqualTo(id);
		return em.selectByExample(ee);
	}
}
