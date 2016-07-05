package com.CMS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	public ModelAndView printStudent(ModelMap model){
		model.addAttribute("name", "Aaradhya Dureha");
		return new ModelAndView("template",model);
	}
}
