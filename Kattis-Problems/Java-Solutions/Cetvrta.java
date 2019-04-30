import java.util.Scanner;

public class Cetvrta {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();

		int ansX = 0;
		int ansY = 0;

		if (x1 == x2) {
			ansX = x3;
		} else if(x1 == x3) {
			ansX = x2;
		} else if(x2 == x3) {
			ansX = x1;
		}

		if(y1 == y2) {
			ansY = y3;
		} else if(y1 == y3) {
			ansY = y2;
		} else if(y2 == y3) {
			ansY = y1;
		}
		
		System.out.println(ansX + " " + ansY);
	}

}
