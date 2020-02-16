package com.vp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vp.model.Student;

@Repository
@Transactional
public class StudentDao {

	@Autowired
	SessionFactory sessionFactory;
//	List<Student> list = null;
//	
//	public List<Student> getStudent(){
//		list = new ArrayList<Student>();
//		list.add(new Student(11,"Shivam","Bansal"));
//		list.add(new Student(12,"Jayant","Pandey"));
//		list.add(new Student(13,"Sanchit","Ojha"));
//		
//		return list;
//	}

	public List<Student> getStudent() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Student.class);
		return criteria.list();
	}
	
	public void saveOrUpdate(Student student) {
		sessionFactory.getCurrentSession().saveOrUpdate(student);
	}
}
