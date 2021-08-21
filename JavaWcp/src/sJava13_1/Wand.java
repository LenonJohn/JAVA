package sJava13_1;

public class Wand {
	
	private String name;
	private double power;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("杖の名前が異常です");
		}
		this.name = name;
	}
	
	public double getPower() {
		return this.power;
	}
	
	public void setPower(double power) {
		if (power < 0.5 || power > 100) {
			throw new IllegalArgumentException("杖に込める魔力量が異常です");
		}
		this.power = power;
	}
	
}
