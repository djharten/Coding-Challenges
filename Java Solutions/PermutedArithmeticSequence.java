import java.util.Arrays;
import java.util.Scanner;

public class PermutedArithmeticSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();

		while (cases != 0) {

			int nums = sc.nextInt();

			int arr[] = new int[nums];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}

			int count = 0;

			for (int k = 0; k < arr.length - 2; k++) {
				if (arr[arr.length - 1 - k] - arr[arr.length - 2 - k] == arr[arr.length - 2 - k]
						- arr[arr.length - 3 - k]) {
					count++;
				}
			}

			if (count == arr.length - 2) {
				System.out.println("arithmetic");
			} else {
				count = 0;
				Arrays.sort(arr);
				for (int k = 0; k < arr.length - 2; k++) {
					if (arr[arr.length - 1 - k] - arr[arr.length - 2 - k] == arr[arr.length - 2 - k]
							- arr[arr.length - 3 - k]) {
						count++;
					}
				}

				if (count == arr.length - 2) {
					System.out.println("permuted arithmetic");
				} else {
					System.out.println("non-arithmetic");

				}
			}

			count = 0;
			cases--;
		}

	}
}
