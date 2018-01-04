import java.util.Scanner;

public class PopularVote {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();

		for (int i = 0; i < cases; i++) {

			int candidates[] = new int[sc.nextInt()];
			
			int winner = 0;
			int largest = 0;
			int sum = 0;
			
			for(int j = 0; j < candidates.length; j++) {
				
				candidates[j] = sc.nextInt();
				sum += candidates[j];
		
				if(candidates[j] > largest) {
					largest = candidates[j];
					winner = j+1;
				}
				
			}
			
			int count = 0;
			
			for(int k = 0; k < candidates.length; k++) {
				if(largest == candidates[k]) {
					count++;
				}
			}
			
			if(count > 1) {
				System.out.println("no winner");
			} else if(largest > sum/2) {
				System.out.println("majority winner " + winner);
			} else {
				System.out.println("minority winner " + winner);
			}

		}
	}
}
