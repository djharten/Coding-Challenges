import java.util.Scanner;

public class TheEasiestProblemIsThisOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		while (number != 0) {
			printResults(calculateInteger(number));
			number = sc.nextInt();
		}

	}

	public static int calculateInteger(int value) {
		int sum = 0;
		int origValue = value;

		while (value > 0) {
			sum += value % 10;
			value /= 10;
		}

		int testValue = 10;
		int testSum = 0;
		int newValue = 0;

		while (sum != testSum) {
			testSum = 0;
			testValue++;
			newValue = origValue * testValue;

			while (newValue > 0) {
				testSum += newValue % 10;
				newValue /= 10;
			}

		}

		return testValue;
	}

	public static void printResults(int answer) {
		System.out.println(answer);
	}

}
