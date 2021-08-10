package sJava11_2;

import sJava10_1.Matango;

public class Dancer extends Character {
	
	public void dance() {
		System.out.println(this.name + "は踊った");
	}
	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("3ポイントのダメージ");
		m.hp -= 3;
	}
}
