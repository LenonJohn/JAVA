package sJava12_2;

public class SjavaP482 {
	public static void main(String[] args) {
		Character[] c = new Character[5];
		c[0] = new Hero();
		c[1] = new Hero();
		c[2] = new Thief();
		c[3] = new Wizard();
		c[4] = new Wizard();
		
		for (Character ch : c) {
			System.out.println(ch.hp);
		}
		
		for (Character ch : c) {
			ch.hp += 50;
		}
		
		for (Character ch : c) {
			System.out.println(ch.hp);
		}
	}
}
