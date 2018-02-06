import java.util.Scanner;

public class Bishops {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {
			
			int size = sc.nextInt();
			
			if (size == 1) {
				System.out.println("1");
			} else {
				int maxBishop = 2 * size - 2;
				System.out.println(maxBishop);
			}
		}
	}

}
