package com.lumen.objbasics;

public class Student {
	String name;
	String department;
	int[] marks;

	public Student(String name, String department, int[] marks) {
		super();
		this.name = name;
		this.department = department;
		this.marks = marks;
	}

	void getDetails() {
		System.out.println("Name : " + name + ", Department : " + department);
	}
	
	void getGrades() {
		int sum = 0;
		int count=1;
		for(int mark : marks) {
			sum+=mark;
			String grade;
			if(mark>=90 && mark<=100) {
				grade="A";
			}else if(mark>=80 && mark<90){
				grade="B";
			}else if(mark>=70 && mark<80) {
				grade="C";
			}else if(mark>=60 && mark<70){
				grade="D";
			}else if(mark>=59 && mark<60) {
				grade="E";
			}else {
				grade="Fail";
			}
			
			System.out.println("Grade for subject-"+(count++)+" is : "+grade);
		}
		
		System.out.println("SUM : "+sum+" | AVG : "+(sum/marks.length));
	}

}


