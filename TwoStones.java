import java.util.Scanner;

public class TwoStones {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		
	//	System.out.print("Please enter the number of stones(Between 1 and 10,000,000): ");
		n = sc.nextInt();
		
	/*	while (n < 1 || n > 10000000 ) {
		System.out.print("Error! Number of stones outside available parameters! Try again: ");
		n = sc.nextInt();
		}*/
		
		if(n % 2 == 1) {
			System.out.println("Alice");
		}else {
			System.out.println("Bob");
		}
	}
}
