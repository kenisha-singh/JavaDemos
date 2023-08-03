package com.lumen.objbasics;

public class StudentMain {

	public static void main(String[] args) {
		Student student1 = new Student("Kenisha", "CSE", new int[]{60,80,90,70,92});
		student1.getDetails();
		student1.getGrades();
		System.out.println();
		Student student2 = new Student("Kash", "IT", new int[]{51,90,70,60,41});
		student2.getDetails();
		student2.getGrades();
	}



	}


