package oops;

class test{
	public void testMethod(){
		System.out.println("I am from test class");
	}
}

public class InheritanceExample extends test{

	public void mainClassMethod(){
		System.out.println("I am from the same class");
		super.testMethod();
	}

	public static void main(String[] args){
		InheritanceExample a = new InheritanceExample();
		a.mainClassMethod();
		a.testMethod();
	}
}
