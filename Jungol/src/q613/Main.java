package q613;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name=sc.next();
		String school=sc.next();
		int grade=sc.nextInt();
		String group=sc.next();
		
		Student student = new Student(name,school,grade,group);

		name=sc.next();
		school=sc.next();
		grade=sc.nextInt();
		group=sc.next();
		
		Student student2 = new Student(name,school,grade,group);
		
		student.print();
		student2.print();
	}
}

class Student {
	private String name;
	private String school;
	private int grade;
	private String group;
	
	public Student(String name, String school, int grade, String group) {
		this.name=name;
		this.school=school;
		this.grade=grade;
		this.group=group;
	}
	
	public void print() {
		System.out.println("Name : "+name);
		System.out.println("School : "+school);
		System.out.println("Grade : "+grade);
		System.out.println("Group : "+group);
	}
}

