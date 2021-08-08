package sJava9_1;

public class Wizard {
	String name;
	int hp;
	
	public void heal(Hero h) {
		h.hp += 10;
		System.out.println(h.name + "のHPを10回復させた");
	}
	
	public void selfheal(Wizard w) {
		w.hp += 10;
		System.out.println(w.name + "は自身を回復させた");
	}
}
