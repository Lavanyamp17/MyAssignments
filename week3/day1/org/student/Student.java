package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName()
	{
		System.out.println("Student Name --> Student");
	}
	public void studentDept()
	{
		System.out.println("Student Department --> Student");
	}
	public void studentID()
	{
		System.out.println("Student ID --> Student");
	}

	public static void main(String[] args) {
		Student stu = new Student();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.deptName();
		stu.studentName();
		stu.studentDept();
		stu.studentID();

	}

}
