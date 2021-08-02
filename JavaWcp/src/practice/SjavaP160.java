package practice;

public class SjavaP160 {
	public static void main(String[] args) {
		int[] seq = new int[10];
		
//		塩基配列を生成
		for (int i = 0; i < seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4);
		}
		
//		生成した塩基配列を表示
		for (int i = 0; i < seq.length; i++) {
////			switch文
//			switch (seq[i]) {
//			case 0:
//				System.out.print("A ");
//				break;
//				
//			case 1:
//				System.out.print("T ");
//				break;
//			
//			case 2:
//				System.out.print("G ");
//				break;
//				
//			case 3:
//				System.out.print("C ");
//				break;
//			}
			
//			char文
			char[] base = {'A', 'T', 'G', 'C'};
			System.out.print(base[seq[i]] + " ");
		}
	}
}
