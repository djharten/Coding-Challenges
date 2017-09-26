import java.util.Scanner;

public class Pet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int highScore = 0;
		int counter = 1;
		int contestant = 0;
		
		for(int i = 1; i <= 5; i++){
			int score1 = sc.nextInt();
			int score2 = sc.nextInt();
			int score3 = sc.nextInt();
			int score4 = sc.nextInt();
		
			int totalScore = score1 + score2 + score3 + score4;
		
				if(totalScore > highScore) {
				highScore = totalScore;
				contestant = counter;
				}
				
			counter++;
			
				if(counter == 6) {
					System.out.println(contestant + " " + highScore);
				}
		}
		sc.close();
	}
}