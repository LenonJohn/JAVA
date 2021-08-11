package sJava12_2;

public class Hero extends Character {
	
	String name;
	int hp;
	
	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}
	
	  public void attack(Monster m) {
	    System.out.println(this.name + "の攻撃！");
	    System.out.println("敵に10ポイントのダメージをあたえた！");
	    m.hp -= 10;
	  }
	}
