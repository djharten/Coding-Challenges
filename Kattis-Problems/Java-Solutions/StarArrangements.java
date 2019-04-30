import java.util.Scanner;

public class StarArrangements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numStars = sc.nextInt();

		int a = 2;
		int b = 1;
		int sum = 0;

		System.out.println(numStars + ": ");

		while (b < numStars) {

			while (sum < numStars) {

				sum += a;
				if (sum == numStars) {
					break;
				}
				sum += b;

			}

			if (sum == numStars && a + b <= numStars && a >= b) {
				System.out.println(a + "," + b);
			} else {

				sum = 0;

				while (sum < numStars) {

					sum += b;
					if (sum == numStars) {
						break;
					}
					sum += a;

				}

				if ((sum == numStars && a + b <= numStars) && a != b && b >= a) {
					System.out.println(a + "," + b);
				}

			}

			sum = 0;

			if (a > b) {
				b++;
			} else {
				a++;
			}

		}

	}

}
