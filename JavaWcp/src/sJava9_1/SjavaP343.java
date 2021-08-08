package sJava9_1;

public class SjavaP343 {
	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		
		Hero h = new Hero();
		System.out.println(h.name);
		h.name = "みなと";
		System.out.println(h.name);
		h.hp = 100;
		h.sword = s;
		
		System.out.println("現在の武器は" + h.sword.name);
		h.attack();
	}
}
