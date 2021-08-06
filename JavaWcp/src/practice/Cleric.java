package practice;

public class Cleric {
	String name;
	int hp = 10;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 50;
	
	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた");
		this.hp = MAX_HP;
		this.mp -= 5;
	}
}
