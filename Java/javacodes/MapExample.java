package javacodes;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<String, String> m = new HashMap<String, String>();
		m.put("user1", "ramesh");
		m.put("user2", "ananda");
		System.out.println(m);
		System.out.println(m.get("user1"));
		

	}

}
