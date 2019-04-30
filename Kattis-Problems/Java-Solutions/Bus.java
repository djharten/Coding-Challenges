import java.util.Scanner;

public class Bus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();

		for(int i = 0; i < cases; i++) {
			int numStops = sc.nextInt();
			int numPassengers = 0;

			for (int i = 1; i <= numStops; i++) {
				numPassengers = (int) (2 * (numPassengers + 0.5));
			}
			System.out.println(numPassengers);
		}
	}
}
