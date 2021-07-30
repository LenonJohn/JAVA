package practice;

public class Fortune_telling {
	public static void main(String[] args) {
		System.out.println("名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		int r = new java.util.Random().nextInt(4);
		System.out.println(r);
		switch (r) {
		case 1:
			System.out.println("大吉");
			break;
		case 2:
			System.out.println("中吉");
			break;
		case 3:
			System.out.println("小吉");
			break;
		default:
			System.out.println("凶");
		}
	}
}
