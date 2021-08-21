package sJava16_1;

import java.util.ArrayList;
import java.util.List;

//class Hero{
//	public String name;
//}

public class SjavaP639 {
	public static void main(String[] args) {
		Hero h = new Hero("minato");
		List<Hero> list = new ArrayList<Hero>();
		list.add(h);
		h.setName("Sugawara");
		System.out.println(list.get(0).getName());
	}
}
