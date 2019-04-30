import java.util.Arrays;
import java.util.Scanner;

public class QuickBrownFox {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < cases; i++) {

			StringBuilder alphabet = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
			String phrase = sc.nextLine();
			phrase = phrase.replaceAll("[^a-zA-Z]", "");
			phrase = phrase.toLowerCase();

			for (int k = 0; k < alphabet.length(); k++) {

				if (phrase.contains(alphabet.substring(k, k + 1))) {
					alphabet.deleteCharAt(k);
					k--;
				}

			}

			if (alphabet.length() == 0) {
				System.out.println("pangram");
			} else {
				String alphaRemain = alphabet.toString();
				char[] letters = alphaRemain.toCharArray();
				Arrays.sort(letters);
				String sortedLetters = new String(letters);
				System.out.println("missing " + sortedLetters);
			}

		}

	}
}
