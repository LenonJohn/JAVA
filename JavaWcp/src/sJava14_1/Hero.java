package sJava14_1;

public class Hero {
	String name;
	int hp;
	static int money;
	
	public String toString() {
		return "ååï¼" + this.name + "ãHp:" + this.hp;
	}
	
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if (o instanceof Hero) {
			Hero h = (Hero)o;
			if (this.name.equals(h.name)) {
				return true;
			}
		}
		return false;
	}
}
