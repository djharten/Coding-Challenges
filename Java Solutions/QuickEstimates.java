import java.util.Scanner;

public class QuickEstimates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		sc.nextLine();

		while (cases > 0) {
			String length = sc.nextLine();
			System.out.println(length.length());
			cases--;
		}
	}
}
