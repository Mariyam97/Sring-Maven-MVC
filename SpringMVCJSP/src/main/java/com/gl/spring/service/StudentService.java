package com.gl.spring.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.spring.dao.StudentDao;
import com.gl.spring.model.Student;

@Service
public class StudentService {

	@Autowired
	StudentDao studentDao;
	
	public ArrayList<Student> getStudentSvc(){
		
		ArrayList<Student> students = studentDao.getStudentDao();
			return students;
		}
	}

