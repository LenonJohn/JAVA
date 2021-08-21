package sJava16_1;

import java.util.HashMap;
import java.util.Map;

public class SjavaP643 {
	public static void main(String[] args) {
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");
		
//		List<Hero> heroes = new ArrayList<Hero>();
//		heroes.add(h1);
//		heroes.add(h2);
//		
//		for (Hero h : heroes) {
//			System.out.println(h.getName());
//		}
		
		Map<Hero, Integer> heroes = new HashMap<Hero, Integer>();
		heroes.put(h1, 3);
		heroes.put(h2, 7);
		
		for (Hero key : heroes.keySet()) {
			int value = heroes.get(key);
			System.out.println(key.getName() + "が倒した敵は" + value + "体");
		}
	}
}
