package com.student.reg.action;

import org.apache.struts2.components.ActionError;

import com.opensymphony.xwork2.ActionSupport;
import com.student.reg.model.StudentRegistrationDao;
import com.student.reg.service.StudentRegistration;

public class StudentRegistrationAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private StudentRegistration student;
	private StudentRegistrationDao studentDao;
	
	public StudentRegistration getStudent() {
		return student;
	}
	public void setStudent(StudentRegistration student) {
		this.student = student;
	}
	public StudentRegistrationDao getStudentDao() {
		return studentDao;
	}
	public void setStudentDao(StudentRegistrationDao studentDao) {
		this.studentDao = studentDao;
	}
	
	public void InsertStudent(StudentRegistration student)
	{
		
	}
	
	public String Save()
	{
		student.setId(1);
		return SUCCESS;
	}
	
	public void validate()
	{
		if(student.getName().trim().equals(""))
		{
			addFieldError("student.name", "Student Name Cannot be Null");
		}else if(student.getAge().intValue() <= 5 || student.getAge().intValue() >= 18)
		{
			addFieldError("student.age", "Age should be between 5 and 18");
		}
	}
	
}
