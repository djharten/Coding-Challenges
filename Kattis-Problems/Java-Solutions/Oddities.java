import java.util.Scanner;

public class Oddities {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();	
		for(int i = 1; i <= input; i++) {
			int number = sc.nextInt();	
			if(number % 2 == 0) {
				System.out.println(number + " is even");
			} else {
				System.out.println(number + " is odd");
			}
		}
	}
}
