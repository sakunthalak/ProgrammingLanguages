package oops;

import java.util.Iterator;

interface AnimalBehavior{
	public void eat();
	public void run();
}


public class InterfaceExample implements AnimalBehavior{
	
 	public void eat(){
		System.out.println("New implementation of eat");
	}
	
	public void run(){
		System.out.println("New implementation of run");
	}
	
	public static void main(String[] args) {		
		InterfaceExample in = new InterfaceExample();
		in.eat();
		in.run();
		
	}

}
