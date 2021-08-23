package sJava17_1;

public class Person {
	int age;
	public void setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("年齢が0歳未満です。（入力値　" + age +" )");
		}
		this.age = age;
	}
}
