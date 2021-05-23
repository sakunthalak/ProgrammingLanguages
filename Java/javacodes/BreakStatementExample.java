package javacodes;

public class BreakStatementExample {

	public static void main(String[] args) {
		int [] numbers = {10, 20, 30, 40, 50};

		for(int x : numbers ) {
			if( x == 30 ) {
				break;
			}
			System.out.print("Value of x : "+ x);
			System.out.print("\n");

		}
	}

}
