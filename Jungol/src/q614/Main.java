package q614;


import java.util.Scanner;

class Student {
	private String school;
	private int grade;
	
	public Student(String school, int grade) {
		this.school = school;
		this.grade = grade;
	}
	
	public void print() {
		System.out.printf("%d grade in %s School\n",this.grade,this.school);
	}
}

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student st1 = new Student("Jejuelementary", 6 );
		
		String studentName = sc.next();
		int grade = sc.nextInt();
		sc.close();
		
		Student st2 = new Student(studentName, grade );
		st1.print();
		st2.print();
	}
}

