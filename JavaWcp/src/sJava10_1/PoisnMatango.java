package sJava10_1;

public class PoisnMatango extends Matango {
	int poisnCount = 5;
	
	public PoisnMatango(char suffix) {
		super(suffix);
	}
	
	public void attack(Hero h) {
		super.attack(h);
		if (this.poisnCount > 0) {
			System.out.println("さらに毒の胞子をばらまいた");
			int dmg = h.hp / 5;
			h.hp -= dmg;
			System.out.println(dmg + "ダメージを受けた");
			this.poisnCount--;
		}
	}
}
