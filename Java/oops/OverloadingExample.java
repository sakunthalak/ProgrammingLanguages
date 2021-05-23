package oops;

class DemoOverload{

	public int add(int x, int y){//method 1
		System.out.println("From method-1");
		return x+y;
	}

	public int add(int x, int y, int z){ //method 2
		System.out.println("From method-2");
		return x+y+z;
	}

	public int add(double x, int y){ //method 3
		System.out.println("From method-3");
		return (int)x+y;
	}

	public int add(int x, double y){ //method 4
		System.out.println("From method-4");
		return x+(int)y;
	}

}

class OverloadingExample{

	public static void main(String[] args){
		DemoOverload demo=new DemoOverload();
		System.out.println(demo.add(2,3));      //method 1 called
		System.out.println(demo.add(2,3,4));    //method 2 called
		System.out.println(demo.add(2,3.4));    //method 4 called
		System.out.println(demo.add(2.5,3));    //method 3 called
	}

}