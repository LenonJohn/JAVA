package practice;

public class SjavaP054 {
	public static void main(String[] args) {
		final double pi = 3.14;
		int pie = 5;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * pi);
		System.out.println("パイの半径を倍にします");
		pie *= 2;
		System.out.println(pie * pie * pi);
	}
}
