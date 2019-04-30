import java.util.Scanner;

public class EstimatingTheAreaOfACircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		int totalDots = sc.nextInt();
		int circleDots = sc.nextInt();
		
		while(radius != 0) {
			double trueArea = Math.PI * Math.pow(radius, 2);
			double estimatedArea = Math.pow(radius*2, 2) * ( (double) circleDots / (double) totalDots);
			
			System.out.println(trueArea + " " + estimatedArea);
			
			radius = sc.nextDouble();
			totalDots = sc.nextInt();
			circleDots = sc.nextInt();
		}
	}
}
