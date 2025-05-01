package com.hussain.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hussain.entity.Emp;

@Repository
@Transactional
public class EmpDaoImpl implements EmpDao {
	
	@Autowired
	public HibernateTemplate hibernateTemplate;

	@Transactional
	@Override
//	public int saveEmp(Emp emp) {
//		int i  = (Integer)this.hibernateTemplate.save(emp);
//		return i;
//	}
    public int saveEmp(Emp emp) {
        hibernateTemplate.setCheckWriteOperations(false); // Disable read-only check
        return (Integer) hibernateTemplate.save(emp);
    }

	@Override
	public Emp getEmpById(int id) {
		Emp emp  = hibernateTemplate.get(Emp.class, id);
		return emp;
	}
	

	@Override
	public List<Emp> getAllEmp() {
		// TODO Auto-generated method stub
		List<Emp> list  = hibernateTemplate.loadAll(Emp.class);
		return list;
	}
	
	@Override
	@Transactional
	public void update(Emp emp) {
		hibernateTemplate.update(emp);
		
	}
	
	
	@Override
	@Transactional
	public void deleteEmp(int id) {
		 Emp emp = hibernateTemplate.get(Emp.class, id);
		 hibernateTemplate.delete(emp);
		
		
	}

}
