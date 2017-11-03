import java.util.Scanner;

public class LeftBeehind {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sweet = sc.nextInt();
		int sour = sc.nextInt();

		while (true) {
			if (sweet == 0 && sour == 0) {
				break;
			} else if (sour + sweet == 13) {
				System.out.println("Never speak again.");
			} else if (sweet > sour) {
				System.out.println("To the convention.");
			} else if (sour > sweet) {
				System.out.println("Left beehind.");
			} else {
				System.out.println("Undecided.");
			}

			sweet = sc.nextInt();
			sour = sc.nextInt();

		}
		sc.close();
	}
}
