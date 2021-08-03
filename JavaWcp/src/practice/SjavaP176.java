package practice;

public class SjavaP176 {
	public static void main(String[] args) {
//		4-1
		int[] points;
		points = new int[4];
		
		double[] weights;
		weights = new double[5];
		
		boolean[] answers;
		answers = new boolean[3];
		
		String[] names;
		names = new String[3];
		
//		4-2
//		int[] moneyList;
//		moneyList = new int[3];
//		moneyList[0] = 121902;
//		moneyList[1] = 8302;
//		moneyList[2] = 55100;
		
		int[] moneyList = {121902, 8302, 55100};
		
		for (int i = 0; i < 3; i++) {
			System.out.println(moneyList[i]);
		}
		
		for (int value : moneyList) {
			System.out.println(value);
		}
	}
}
