package com.gl.model;

public class Student {

	String s_Id;
	String s_Name;
	int score;
	
	
	public Student() {
		
		// TODO Auto-generated constructor stub
	}
	
	public Student(String s_Id, String s_Name, int score) {
		
		this.s_Id = s_Id;
		this.s_Name = s_Name;
		this.score = score;
	}

	public String getS_Id() {
		return s_Id;
	}
	public void setS_Id(String s_Id) {
		this.s_Id = s_Id;
	}
	public String getS_Name() {
		return s_Name;
	}
	public void setS_Name(String s_Name) {
		this.s_Name = s_Name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [s_Id=" + s_Id + ", s_Name=" + s_Name + ", score=" + score + "]";
	}
	
	
}
