package javacodes;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user name");
		String username = sc.nextLine();
		System.out.println("Enter the roll number (only number)");
		int rollnumber = sc.nextInt();
		sc.close();
		System.out.println("Enter the username - "+username);
		System.out.println("Username entered is - "+ rollnumber);

	}

}
