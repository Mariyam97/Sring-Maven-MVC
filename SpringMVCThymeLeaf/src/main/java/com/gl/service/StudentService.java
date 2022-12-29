package com.gl.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.model.Student;
import com.gl.dao.StudentDao;

@Service
public class StudentService {

	@Autowired
	StudentDao studentDao;
	
	public ArrayList<Student> getStudentSvc(){
		
		ArrayList<Student> students = studentDao.getStudentDao();
			return students;
		}
	}

