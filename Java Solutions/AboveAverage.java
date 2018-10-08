import java.util.Scanner;

public class Bubble {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; i < cases; i++) {
			int numScores = sc.nextInt();
			double arr[] = new double[numScores];
			
			for(int j = 0; j < numScores; j++) {
				arr[j] = sc.nextInt();
				sum +=  arr[j];
			}
			
			int avg = sum / numScores;
			double numAbove = 0;
			
			for(int k = 0; k < numScores; k++) {
				if(arr[k] > avg) {
					numAbove++;
				}
			}
			
			double percentAbove = (numAbove / numScores)*100;
			System.out.printf("%.3f",percentAbove);
			System.out.println("%");

			sum = 0;
		}
	}
}
