package sJava12_2;

public abstract class Character {
	String name;
	int hp = 100;
	
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	
	public abstract void attack(Monster m) ;
}	
