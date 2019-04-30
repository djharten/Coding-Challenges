import java.util.Scanner;

public class Bela {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberHands = sc.nextInt();
		char value = sc.next().charAt(0);

		int totalHands = numberHands * 4;

		String numCard = "";
		String suitCard = "";
		String allInput = "";

		for (int k = 0; k < totalHands; k++) {
			allInput += sc.next();
		}

		for (int i = 0; i < allInput.length(); i += 2) {
			numCard += allInput.charAt(i);
		}

		for (int q = 1; q <= allInput.length(); q += 2) {
			suitCard += allInput.charAt(q);
		}

		int total = 0;

		for (int j = 0; j < totalHands; j++) {

			if (value == suitCard.charAt(j) && (numCard.charAt(j) == 'J' || numCard.charAt(j) == '9')) {
				if (numCard.charAt(j) == 'J') {
					total += 20;
				}
				if (numCard.charAt(j) == '9') {
					total += 14;
				}

			} else {
				if (numCard.charAt(j) == 'A') {
					total += 11;
				}
				if (numCard.charAt(j) == 'K') {
					total += 4;
				}
				if (numCard.charAt(j) == 'Q') {
					total += 3;
				}
				if (numCard.charAt(j) == 'J') {
					total += 2;
				}
				if (numCard.charAt(j) == 'T') {
					total += 10;
				}
			}
		}
		System.out.println(total);
	}
}
