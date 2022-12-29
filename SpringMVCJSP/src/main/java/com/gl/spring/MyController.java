package com.gl.spring;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.spring.dao.StudentDao;
import com.gl.spring.model.Student;
import com.gl.spring.service.StudentService;

@Controller
@RequestMapping("/hello")
public class MyController {
	
	
	@Autowired
	StudentService studentService;
	
	
	@RequestMapping("/greet")
	public String sayHello(Model model) {
		String greeting = " Hi! welcome to spring-mvc-jsp";
		model.addAttribute("greetings",greeting);
		return "welcome";
		
	}
	
	@RequestMapping("/students")
	public String getStudentData(Model model) {
		ArrayList<Student> mystudents=studentService.getStudentSvc();
		model.addAttribute("students" , mystudents);
		return "student-list";
}
}
