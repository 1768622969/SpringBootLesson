package cn.et.lesson03.food.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.et.lesson03.food.dao.DeptMapper;
import cn.et.lesson03.food.entity.Dept;
import cn.et.lesson03.food.entity.DeptExample;
import cn.et.lesson03.food.entity.TreeNode;
import cn.et.lesson03.food.service.DeptService;
import cn.et.lesson03.food.utils.PageTools;
@Service
public class DeptServiceImpl implements DeptService {
	@Autowired
	DeptMapper dm;
	/* (non-Javadoc)
	 * @see cn.et.lesson03.food.service.impl.StudentService#queryStudent(java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see cn.et.lesson03.food.service.impl.DeptService#queryTreeNode(java.lang.Integer)
	 */
	public List<TreeNode> queryTreeNode(Integer pid){
		DeptExample de=new DeptExample();
		de.createCriteria().andPidEqualTo(pid);
		List<Dept> dept=dm.selectByExample(de);
		List<TreeNode> deptList=new ArrayList<TreeNode>();
		for(Dept d:dept){
			TreeNode tn=new TreeNode();
			tn.setId(d.getId());
			tn.setText(d.getDname());
			// �жϵ�ǰ�ڵ����Ƿ񻹴����ӽڵ�
			if(queryTreeNode(d.getId()).size()==0){
				tn.setState("open");
			}
			deptList.add(tn);
		}
		return deptList;
	}
}
