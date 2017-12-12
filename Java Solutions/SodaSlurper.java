import java.util.Scanner;

public class SodaSlurper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int emptyBottles = sc.nextInt();
		int foundBottles = sc.nextInt();
		int costBottles = sc.nextInt();
		
		int sodasDrank = (emptyBottles + foundBottles) / costBottles;
		
		int remainingBottles = ((emptyBottles + foundBottles) % costBottles) + sodasDrank;
		
		while(remainingBottles >= costBottles) {
			int extraDrank = remainingBottles / costBottles;
			sodasDrank += extraDrank;
			remainingBottles = (remainingBottles % costBottles) + extraDrank;
		}
		
		System.out.println(sodasDrank);

	}

}
