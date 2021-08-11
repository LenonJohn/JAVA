package sJava12_2;

public class SjavaP471 {
	public static void main(String[] args) {
		Wizard w = new Wizard();
		Character c = w;
		Matango m = new Matango();
		c.name = "アサカ";
		c.attack(m);
		c.fireball(m);
	}
}
