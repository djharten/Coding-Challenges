import java.util.Scanner;

public class NumberFun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		sc.nextLine();

		while (cases != 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			calcAndPrint(a, b, c);
			cases--;
		}
	}

	public static void calcAndPrint(int a, int b, int c) {
		
		double divA = (double) a;
		double divB = (double) b;
		double divC = (double) c;

		if (a + b == c || a - b == c || b - a == c  || a * b == c || divA / divB == divC || divB / divA == divC) {
			System.out.println("Possible");
		} else {
			System.out.println("Impossible");
		}
	}
}
