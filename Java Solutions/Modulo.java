import java.util.Arrays;
import java.util.Scanner;

public class Modulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt() % 42;
		}

		int counter = 10;
		Arrays.sort(arr);

		for (int k = 1; k < arr.length; k++) {
			if (arr[k - 1] == arr[k]) {
				counter--;
			}
		}
		System.out.println(counter);
	}
}
