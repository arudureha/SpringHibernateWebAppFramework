package com.CMS.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CMS.dao.TeacherDao;
import com.CMS.data.Teacher;
import com.CMS.service.TeacherService;

@Service("teacherService")
public class TeacherServiceImpl implements TeacherService{

	@Autowired
	TeacherDao teacherDao;
	
	public List<Teacher> fetchAllTeachers() {
		return teacherDao.fetchAllTeachers();
	}
	

}
