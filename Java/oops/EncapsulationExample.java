package oops;

class EnDeclaration{
	private String name;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
		
	}
}

public class EncapsulationExample {

	public static void main(String[] args) {
		EnDeclaration test = new EnDeclaration();
		System.out.println("Before declaration - "+test.getName());
		test.setName("Ramesh");
		String nameFromEnDeclaration = test.getName();
		System.out.println(nameFromEnDeclaration);
	}

}