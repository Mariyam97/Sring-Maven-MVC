package com.gl.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.model.Student;
import com.gl.service.StudentService;

@Controller
@RequestMapping("/hello")
public class MyController {

	
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/greet")
	public String sayHello(Model model) {
		String greeting = "Hi Welcome to Spring MVC- Thymeleaf !!!";
		model.addAttribute("greetings", greeting);
		return "welcome";
	}
	
	@RequestMapping("/studs")
	public String getStudents(Model model) {
		
		ArrayList<Student> students = studentService.getStudentSvc();
		model.addAttribute("studentdata",students);
		return "student-list";
	}
	}

