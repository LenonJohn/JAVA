package sJava11_2;

//public class Book {
//	String name;
//	int price;
//	String color;
//	String isbn;
//	
//	public Book(String name, int price, String color, String isbn) {
//		this.name = name;
//		this.price = price;
//		this.color = color;
//		this.isbn = isbn;
//	}
//	
//	public String getName() {
//		return this.name;
//	}
//	
//	public int getPrice() {
//		return this.price;
//	}
//	
//	public String getColor() {
//		return this.color;
//	}
//	
//	public String getIsbn() {
//		return this.isbn;
//	}
//}

public class Book extends TangibleAsset{
	String isbn;
	
	public Book(String name, int price, String color, String isbn) {
		super(name, price, color);
		this.isbn = isbn;
	}
	
	public String getIsbn() {
		return this.isbn;
	}
}