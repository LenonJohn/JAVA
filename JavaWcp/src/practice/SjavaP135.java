package practice;

public class SjavaP135 {
	public static void main(String[] args) {
		int isHungry = 1;
		String food = "rice";
		System.out.println("こんにちは");
		
		if (isHungry == 0) {
			System.out.println("お腹がいっぱいです");
		} else {
			System.out.println("腹ペコです");
			System.out.println(food + "をいただきます");
		}
		System.out.println("ごちそうさまでした");
		
		
//		回答
//		if (isHungry == 0) {
//			System.out.println("お腹がいっぱいです");
//		} else {
//			System.out.println("腹ペコです");
//		}
//		if (isHungry == 1) {
//			System.out.println(food + "をいただきます");
//		}
//		System.out.println("ごちそうさまでした");
		
		
//		
//		三項条件演算子
//		System.out.println(isHungry == 0 ? "お腹がいっぱいです" : "腹ペコです");
//		if (isHungry == 1) {
//			System.out.println(food + "をいただきます");
//		}
//		System.out.println("ごちそうさまでした");
	}
}