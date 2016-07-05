package com.CMS.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CMS.dao.StudentDao;
import com.CMS.data.Student;
import com.CMS.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentDao studentDao;

	public List<Student> fetchAllStudents() {
		return studentDao.fetchAllStudents();
	}
	

}
