package sJava13_1;


public class Hero {
	private int hp;
	private String name;
	private Sword sword;
	
	public void bye() {
		System.out.println("勇者は別れを告げた");
	}
	
	void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した");
	}
	
	private void die() {
		System.out.println(this.name + "は死んでしまった");
		System.out.println("Game Over");
	}
	
	public void attack(Matango m) {
	    System.out.println(this.name + "の攻撃！");
	    /* … */
	    System.out.println("お化けキノコ" + m.suffix + "から2ポイントの反撃を受けた");
	    this.hp -= 2;
	    if (this.hp <= 0) {
	      this.die();
	    }
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("名前が入力されていません");
		}
		
		if (name.length() <= 1) {
			throw new IllegalArgumentException("名前が短すぎます");
		}
		
		if (name.length() >= 8) {
			throw new IllegalArgumentException("名前が長すぎます");
		}
		
		this.name = name;
		
	}
	
}
