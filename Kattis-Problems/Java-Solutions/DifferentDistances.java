import java.util.Scanner;

public class DifferentDistances {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			double x1 = sc.nextDouble();
			if(x1 == 0) {
				break;
			}
			double x2 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double p = sc.nextDouble();
			
			double pNorm = Math.pow(Math.pow(Math.abs(x1-y1), p) + Math.pow(Math.abs(x2-y2), p), 1 / p);

			System.out.println(pNorm);
		}
	}
}
