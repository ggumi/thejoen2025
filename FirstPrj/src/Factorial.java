
public class Factorial {
    public static void main(String[] args) {
        int a=3;
        int result=3*2*1;
        System.out.println(factorial(5));
        
    }
    
    public static int factorial(int a) {
        if(a!=1){
            return a*factorial(a-1);
        } else {
        	return 1;
        }
    }
}

