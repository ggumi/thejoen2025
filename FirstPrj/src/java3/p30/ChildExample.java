package java3.p30;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = new Parent();
		
		parent.method1();
		parent.method2();
		
		child.method1();
		child.method2();
		child.method3();
		
		Parent dd = new Child();
		
	}

}
