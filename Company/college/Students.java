package org.college;

public class Students extends Staff  {
	public void studentId() {
		System.out.println("student id is 014");
	}
	public void studentName() {
		System.out.println("student name is Dhiwa");
	}
	public static void main(String[]args) {
		Students a= new Students();
		a.studentId();
		a.studentName();
		a.staffId();
		a.staffName();
		a.principalId();
		a.principalName();
	}

}
