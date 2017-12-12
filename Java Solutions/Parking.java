import java.util.Arrays;
import java.util.Scanner;

public class Parking {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();

		while (cases != 0) {
			int stops = sc.nextInt();
			int arr[] = new int[stops];

			for (int i = 0; i < stops; i++) {
				arr[i] = sc.nextInt();
			}

			Arrays.sort(arr);

			int shortestDist = (arr[arr.length - 1] - arr[0]) * 2;
			System.out.println(shortestDist);
			cases--;
			sc.nextLine();
		}

	}

}
