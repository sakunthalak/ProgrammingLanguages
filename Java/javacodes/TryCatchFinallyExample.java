package javacodes;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		//divide by zero
		int a = 10, b = 0, c;
		
		try{
			c = a / b;
			System.out.println("Value of c is " + c);
		}
		catch (ArithmeticException e){
			System.out.println("Found Arithmatic Exception, please find the below stacktrace \n");
			e.printStackTrace();
		}
		finally{
			System.out.println("\nI am from the finally block");
		}

	}

}
