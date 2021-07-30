package practice;

public class Sjavap092 {
	public static void main(String[] args) {
		int r = new java.util.Random().nextInt(90);
		System.out.println("あなたはたぶん" + r + "歳ですね？");
		
		System.out.println("入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("入力してください");
		int age = new java.util.Scanner(System.in).nextInt();
		System.out.println("ようこそ、" + name + "さん、あなたの年齢は" + age + "ですね？");
	}
}
