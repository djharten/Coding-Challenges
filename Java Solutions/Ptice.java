// During a day of utter boredom, this program was
// written with the sole intent of being as inefficient
// as possible, yet still working. I'd say mission accomplished

import java.util.Scanner;

public class Ptice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numQuestions = sc.nextInt();
		sc.nextLine();
		String answerKey = sc.nextLine();

		String adrianSeq = "ABCABCABCABC";
		String brunoSeq = "BABCBABCBABC";
		String goranSeq = "CCAABBCCAABB";

		int a = 0;
		int b = 0;
		int g = 0;
		int counter = 0;
		char adrianRight = 'q';
		char brunoRight = 'q';
		char goranRight = 'q';
		char ans = 'q';
		int counter2 = 0;

		while(numQuestions > 0) {

			ans = answerKey.charAt(counter);
			adrianRight = adrianSeq.charAt(counter2);
			brunoRight = brunoSeq.charAt(counter2);
			goranRight = goranSeq.charAt(counter2);

			if (ans == adrianRight) {
				a++;
			}
			if (ans == brunoRight) {
				b++;
			}
			if (ans == goranRight) {
				g++;
			}
			
			counter++;
			counter2++;
			numQuestions--;
			if(counter2 == 12) {
				counter2 = 0;
			}

		}

		if (a > b && a > g) {
			System.out.println(a);
			System.out.println("Adrian");
		} else if (b > a && b > g) {
			System.out.println(b);
			System.out.println("Bruno");
		} else if (g > a && g > b) {
			System.out.println(g);
			System.out.println("Goran");
		} else if (a == b && a != g) {
			System.out.println(a);
			System.out.println("Adrian");
			System.out.println("Bruno");
		} else if (a == g && a != b) {
			System.out.println(a);
			System.out.println("Adrian");
			System.out.println("Goran");
		} else if (b == g && a != b) {
			System.out.println(b);
			System.out.println("Bruno");
			System.out.println("Goran");
		} else {
			System.out.println(a);
			System.out.println("Adrian");
			System.out.println("Bruno");
			System.out.println("Goran");
		}
	}
}
