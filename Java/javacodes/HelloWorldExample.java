package javacodes;

public class HelloWorldExample {
	public static void main(String[] args) {
		testExample obj1 = new testExample();
//		obj1.methodExample1();
		
		testExample obj2 = new testExample();
		obj2.methodExample2();
	}
	

}

class testExample{
	public void methodExample1() {
		System.out.println("My name is Ramesh");
	}
	
	public void methodExample2() {
		System.out.println("My profession is software engineer");
	}
}