package practice;

public class SjavaP218 {
////	5-1
//	public static void introduceOneself() {
//		String name = "Yamada";
//		int age = 24;
//		double height = 2.4;
//		char eto = '辰';
//		
//		System.out.println(name + age + height + eto);
//	}
//	
//	
//	public static void main(String[] args) {
//
//		introduceOneself();
//	}
	
//	5-2
//	public static void main(String[] args) {
//		String title = "タイトル";
//		String address = "a@a";
//		String text = "本文";
//		
//		email(title, address, text);
//	}
//	
//	public static void email(String title, String address, String text) {
//		System.out.println(address + "に、以下のメールを送りました。");
//		System.out.println("件名：" + title);
//		System.out.println("本文：" + text);
//	}

//	5-3
//	public static void main(String[] args) {
//		String title = "タイトル";
//		String address = "a@a";
//		String text = "本文";
//		
//		email(title, address, text);
//	}
//	
//	public static void email(String title, String address, String text) {
//		System.out.println(address + "に、以下のメールを送りました。");
//		System.out.println("件名：" + title);
//		System.out.println("本文：" + text);
//	}
//	
//	public static void email(String title, String address) {
//		System.out.println(address + "に、以下のメールを送りました。");
//		System.out.println("件名：" + title);
//	}
	
//	5-4
	public static double calcTriangleArea(double height, double bottom) {
		double triangleAns = (bottom * height) / 2;
		return triangleAns;
	}
	
	public static double calcCircleArea(double radius) {
		double circleAns = radius * radius * 3.14;
		return circleAns;
	}
	
	public static void main(String[] args) {
		double triangleAns = calcTriangleArea(10.0, 5.0);
		System.out.println("三角形の面積は" + triangleAns + "cm2");
		double circlreAns = calcCircleArea(5.0);
		System.out.println("円の面積は" + circlreAns + "cm2");
	}
	

}
