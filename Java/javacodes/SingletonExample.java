package javacodes;

import java.util.*;

public class SingletonExample {

	   private static SingletonExample singleton = new SingletonExample( );

	   /* A private Constructor prevents any other
	    * class from instantiating.
	    */
	   private SingletonExample() { }

	   /* Static 'instance' method */
	   public static SingletonExample getInstance() {
	      return singleton;
	   }

	   /* Other methods protected by singleton-ness */
	   protected static void demoMethod( ) {
	      System.out.println("demoMethod for singleton");
	   }
	}