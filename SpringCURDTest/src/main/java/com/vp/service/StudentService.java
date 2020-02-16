package com.vp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vp.dao.StudentDao;
import com.vp.model.Student;

@Service
public class StudentService {

	@Autowired
	StudentDao studentDao;
	
	public List<Student> getStudent(){
		return studentDao.getStudent();
	}
	
	public void saveOrUpdate(Student student) {
		studentDao.saveOrUpdate(student);
	}
}
