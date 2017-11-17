import java.util.Scanner;

public class AboveAverage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		int sum = 0;
		
		while(cases != 0) {
			int numScores = sc.nextInt();
			double arr[] = new double[numScores];
			
			for(int i = 0; i < numScores; i++) {
				arr[i] = sc.nextInt();
				sum +=  arr[i];
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
			cases--;
		}
	}
}
