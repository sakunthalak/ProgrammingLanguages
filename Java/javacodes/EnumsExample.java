package javacodes;

import javacodes.FreshJuice.FreshJuiceSize;

class FreshJuice{
	enum FreshJuiceSize{SMALL, MEDIUM, LARGE}
	FreshJuiceSize size;
}

public class EnumsExample {

	public static void main(String[] args) {
		FreshJuice juice = new FreshJuice();
		juice.size = FreshJuiceSize.SMALL;
		System.out.println("Size: "+juice.size);

	}

}
