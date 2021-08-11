package sJava12_2;

public class SjavaP484 {
	public static void main(String[] args) {
		Hero h = new Hero("ミナト");
		Slime s = new Slime();
		Matango m = new Matango();
		
		h.attack(s);
		h.attack(m);
	}
}
