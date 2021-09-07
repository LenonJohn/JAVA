package sjava2_8;

public class Sjava2_3 {
	public static void main(String[] args) {
		System.out.println("占いの館にようこそ");
		
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		
		System.out.println("あなたの年齢を入力してください");
		String ageString = new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);
		
		int fortune = new java.util.Random().nextInt(4);
		fortune++;
		
		System.out.println("占いの結果が出ました。");
		System.out.print(age + "歳の" + name + "の運勢は");
		switch (fortune) {
		case 1 :
			System.out.print("大吉です");
			break;
		case 2:
			System.out.print("中吉です");
			break;
		case 3:
			System.out.print("小吉です");
			break;
		default:
			System.out.print("凶です");
		}
	}
}
