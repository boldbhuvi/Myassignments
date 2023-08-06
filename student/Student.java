package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName()
	{
		System.out.println("Bhuvana");
		
	}
	
	public void studentDept()
	{
		System.out.println("ECE");
		
	}
	
	public void studentId()
	{
		System.out.println("701289");
		
	}
	
	public static void main(String[] args) {
		Student access=new Student();
		access.studentDept();
		access.studentId();
		access.studentName();
		access.collegeName();
		access.collegeRank();
		access.collegeCode();
		access.deptName();
		
		
		
	}

}
