package practice;

public class SjavaP193 {
	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		hello("Aさん");
		hello("Bさん");
		hello("Cさん");
		System.out.println("メソッドの呼び出しを終了します");
	}
	
	public static void hello(String name) {
		System.out.println(name + "、こんにちは");
	}
}
