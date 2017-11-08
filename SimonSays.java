import java.util.Arrays;
import java.util.Scanner;

public class SimonSays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int commands = sc.nextInt();
		sc.nextLine();
		String test = "simon says";

		for (int i = 0; i < commands; i++) {
			String input = sc.nextLine();
			if(input.length() < 11) {
				System.out.println();
			} else if (input.substring(0, 10).contains(test)) {
				System.out.println(input.substring(11));
			} else {
				System.out.println();
			}
		}
	}
}
