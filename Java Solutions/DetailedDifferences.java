import java.util.Scanner;

public class DetailedDifferences {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();
		sc.nextLine();

		int counter = 0;
		String output = "";

		while (numCases != counter) {
			String input1 = sc.nextLine();
			String input2 = sc.nextLine();

			for (int i = 0; i < input1.length(); i++) {
				if (input1.charAt(i) != input2.charAt(i)) {
					output += "*";
				} else {
					output += ".";
				}
			}

			System.out.println(input1);
			System.out.println(input2);
			System.out.println(output);
			output = "";
			counter++;
		}

	}

}
