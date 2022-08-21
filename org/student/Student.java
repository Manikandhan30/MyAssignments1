package org.student;

import org.department.Department;

public class Student extends Department {
  public void studentName() {
	  System.out.println("studentName  : ABC");
  }
    public void studentDept() {
    	System.out.println("studentDepartment   : computer Science");
    }
    public void studentId( ) {
    	System.out.println("student ID    : 123");
    }
    public static void main(String[] args) {
		Student obj = new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
        obj.studentDept();
		obj.studentName();
		obj.studentId();
		
	}              
    
}
