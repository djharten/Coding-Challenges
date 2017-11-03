import java.util.Scanner;

public class Soylent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();

		int bottle = 400;
		int counter = 0;
		int numBottles = 0;

		int calReq = sc.nextInt();

		while (cases != counter) {
			for (int i = 1; i <= cases; i++) {
				numBottles = calReq / bottle;
				if (calReq % bottle != 0) {
					numBottles++;
				}
			}

			System.out.println(numBottles);
			counter++;
			if (counter != cases) {
				calReq = sc.nextInt();
			}

		}

	}

}
