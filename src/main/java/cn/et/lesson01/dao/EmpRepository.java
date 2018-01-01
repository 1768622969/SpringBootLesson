package cn.et.lesson01.dao;

import org.springframework.data.repository.CrudRepository;

import cn.et.lesson01.Emp;

// CrudRepository自动对Emp表进行增删改查
public interface EmpRepository extends CrudRepository<Emp, Integer>{

}
