import java.util.Scanner;

public class PaulEigon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int turns = sc.nextInt();
		int paulScore = sc.nextInt();
		int oppScore = sc.nextInt();
		
		int totalScore = paulScore + oppScore;
		if(((totalScore)/turns)% 2 == 0) {
			System.out.println("paul");
		} else {
			System.out.println("opponent");
		}

	}

}
