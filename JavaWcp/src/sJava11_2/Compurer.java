package sJava11_2;

public class Compurer extends TangibleAsset {
	String makerName;
	
	public Compurer(String name, int price, String color, String makerName) {
		super(name, price, color);
		this.makerName = makerName;
	}
	
	public String getmakerName() {
		return this.makerName;
	}
}
