package org.student;

import org.department.Department;

public class Student  extends Department{
	private void studentName() {
		System.out.println("Student Name: Nisha");
	}
	
	public void studentDept() {
		System.out.println("Student Department: Computer Science");
	}
	
	public void studentId() {
		System.out.println("Student Id: 12345");

	}
	
	public static void main(String[] args) {
		Student studentObj = new Student();
		studentObj.studentId();
		studentObj.studentName();
		studentObj.studentDept();
		studentObj.departmentName();
		studentObj.collegeName();
		studentObj.collegeCode();
		studentObj.collegeRank();
	}

}
/*Learnings
 * Class can be inherited from different packages
 * When inheriting from different package, have to import the package within the class
 * private methods are accessed only within the class and cannot be accessed from any other class, even in inherited class
 */
