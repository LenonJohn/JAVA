package sJava11_2;

public class KyotoCleaningShop implements CleaningService {
	String ownerName;
	String address;
	String phone;
	
	public Shirt washShirt(shirt s) {
//		大型洗濯機5分
		return s;
	}
	
	public Towl washTowl(Towl t) {
//		大型洗濯機10分
		return t;
	}
	
	public Coat washCoat(Coat c) {
//		ドライ20分
		return c;
	}
}
