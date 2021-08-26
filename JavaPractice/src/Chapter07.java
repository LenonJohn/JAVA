
public class Chapter07 {
	public static void main(String[] args) {
		int num = 16;
		if (num <= 5) {
			System.out.println("とても近いです");
		} else if (num <= 10) {
			System.out.println("近いです");
		} else if (num <= 15) {
			System.out.println("遠いです");
		} else {
			System.out.println("とても遠いです");
		}
		
		String col = "red";
		switch (col) {
		case "red":
			System.out.println("red");
			break;
		case "blue":
			System.out.println("blue");
			break;
		case "yellow":
			System.out.println("yellow");
			break;
		default:
			System.out.println("N/A");
		}
	}
}
