package sJava9_1;

public class SjavaP365 {
	public static void heal(int hp) {
		hp += 10;
		System.out.println(hp);
	}
	
	public static void heal(Thief thief) {
		thief.hp += 10;
	}
	
	public static void main(String[] args) {
		int baseHp = 25;
		Thief t = new Thief("アサカ", baseHp);
		System.out.println(baseHp + "：" + t.hp);
		heal(baseHp);
		heal(t);
		System.out.println(baseHp + "：" + t.hp);
		System.out.println(t.mp);
	}
}
