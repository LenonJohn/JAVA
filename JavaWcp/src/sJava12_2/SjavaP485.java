package sJava12_2;

public class SjavaP485 {
	public static void main(String[] args) {
		Monster[] monsters = new Monster[3];
		monsters[0] = new Slime();
		monsters[1] = new Goblin();
		monsters[2] = new DeathBat();
		
		for (Monster m : monsters) {
			m.run();
		}
	}
}
