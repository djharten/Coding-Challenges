import java.util.Scanner;

public class SpeedLimit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();

		while (cases != -1) {
			int mph[] = new int[cases];
			int hours[] = new int[cases];
			
			for (int i = 0; i < cases; i++) {
				mph[i] = sc.nextInt();
				hours[i] = sc.nextInt();
			}

			int miles = 0;

			for (int k = 0; k < cases - 1; k++) {
				miles += (hours[cases - 1 - k] - hours[cases - 2 - k]) * mph[cases - k - 1];
			}

			miles += hours[0] * mph[0];

			System.out.println(miles + " miles");

			cases = sc.nextInt();

		}
	}
}
