package com.hp.phd.test.object;

public class Student extends Person{
	private String school;

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	public static void main(String[] args){
		Student stu=new Student();
		stu.setName("张三");
		stu.setSex("male");
		stu.setAge(18);
		stu.setSchool("海大");
	}
}
