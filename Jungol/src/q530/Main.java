package q530;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		sc.close();
		
		if(num1 >= 20) {
			System.out.printf("%s","adult");
		} else {
			System.out.printf("%d years later", 20-num1);
		}
	}

}
