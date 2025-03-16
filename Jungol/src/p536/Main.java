package p536;

public class Main {

	public static void main(String[] args) {

		//1. for
		for(int i=1;i<=15;i++) {
			System.out.print(i+" ");
		}
		
		//2.while
		int k=1;
		while(k<=15) {
			System.out.print(k++ +" ");
		}
		//3.do while
		int j=1;

		do {
			//int num=1;
			System.out.print(j++ +" ");
		}while(j<=15);
	}

}
