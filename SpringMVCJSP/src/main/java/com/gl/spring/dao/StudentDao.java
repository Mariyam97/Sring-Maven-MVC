package com.gl.spring.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.gl.spring.model.Student;

@Repository
public class StudentDao {
	
	ArrayList <Student> students;
	
	public ArrayList<Student> getStudentDao(){
		
		students = new ArrayList<Student>();
		students.add(new Student("S001","Aman",99));
		students.add(new Student("S002","Anam",89));
		students.add(new Student("S003","Amreen",79));
		students.add(new Student("S004","Bibi",92));
		students.add(new Student("S005","Mariyam",69));
		
		return students;
	}
	

}
