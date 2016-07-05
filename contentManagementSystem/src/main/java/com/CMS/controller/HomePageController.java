package com.CMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.CMS.data.Student;
import com.CMS.data.Teacher;
import com.CMS.form.StudentForm;
import com.CMS.service.StudentService;
import com.CMS.service.TeacherService;

@Controller
public class HomePageController{
	
	@Autowired
	StudentService studentService;
	@Autowired
	TeacherService teacherService;
	
	@RequestMapping(value="/CMS", method=RequestMethod.GET)
	public String populateOverviewInfoTable(ModelMap model){
		StudentForm studentForm = new StudentForm();
		
		List<Teacher> allTeachers = teacherService.fetchAllTeachers();
		List<Student> allStudents = studentService.fetchAllStudents();

		model.addAttribute("allStudents",allStudents);
		model.addAttribute("allTeachers",allTeachers);
		model.addAttribute("studentForm",studentForm);
		return "homePage";
	}
	
	@RequestMapping(value="/CMS/addTeacher", method=RequestMethod.GET)
	public String addTeachers(ModelMap model){
		System.out.println("Inside");
		return null;
	}
}
