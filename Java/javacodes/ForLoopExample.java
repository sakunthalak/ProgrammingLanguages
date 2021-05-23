package javacodes;

public class ForLoopExample {
	
	public static void main(String[] args) {
		int [] numbers = {10, 20, 30, 40, 50, 60};
		
//		for(int i=0; i<9; i++){
//			System.out.println("The value of i is "+i);
//		}
		
//		for loop example
		for(int i=0; i<numbers.length; i++){
			System.out.println("number : " + numbers[i]);
		}
		
		//for loop example
//		for(int i=numbers.length; i>1; i--){
//			System.out.println("number : " + numbers[i]);
//			
//		}
//		
		//second way of implement ==> forEachLoop
		for(int i:numbers){
			System.out.println("\nFrom foreach loop");
			System.out.println("number : " + i);
		}
	}
}
