package q518;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //ctrl shift o
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		sc.close();
		
		int sum;
		sum= a + b + c;
		System.out.println("sum : "+sum);
		
		int avg;
		avg = sum / 3;
		System.out.println("avg : "+avg);
		
	}

}
