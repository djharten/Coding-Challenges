import java.util.Scanner;

public class CryptographersConundrum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input[];
		input = sc.nextLine().split("");

		int counter = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i].compareTo("P") != 0) {
				counter++;
			}
			if (input[i + 1].compareTo("E") != 0) {
				counter++;
			}
			if (input[i + 2].compareTo("R") != 0) {
				counter++;
			}

			i += 2;
		}
		System.out.println(counter);
	}
}