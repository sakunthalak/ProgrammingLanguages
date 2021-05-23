//package declaration
package javacodes;

//import statements come here

public class TestClass {
	//Class variables (using static variables)
	static String name = "Ramesh";
	static int age = 30;
		
	//Instance variables (w/o static variables)
	String rollNumber = "R12345";
	int testVariable;
	
	public void localVariableMethod(){
		//Local variable declaration (general example of java literals)
		String phoneNumber = "9886098860";
		String emailId = "abc@gmail.com";
		System.out.println("Out put from localVariableMethod");
	}
	
	public static void testMethod(){
		System.out.println("Name : "+ name);
		System.out.println("Age : "+ age);
//		System.out.println("Roll Number : "+ rollNumber);
//		System.out.println("Phone Number : "+ phoneNumber);
//		System.out.println("Email Id : "+ emailID);
		
	}
	
	public static void main(String[] args) {
		//Creating an object by instantiating the class ==> Explicit constructor
		TestClass test = new TestClass();
		test.localVariableMethod();
		System.out.println("Instance Variable : "+ test.rollNumber);
		System.out.println("Test Variable : "+ test.testVariable);
		
		//Accessing static methods
		testMethod();
//		TestClass.testMethod(); //or by giving a fully qualified name
	}
}