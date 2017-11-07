import java.util.Arrays;
import java.util.Scanner;

public class Modulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int arrTwo[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			arrTwo[i] = (arr[i] % 42);
		}

		int counter = 10;
		Arrays.sort(arrTwo);

		for (int k = 1; k < arr.length; k++) {
			if (arrTwo[k - 1] == arrTwo[k]) {
				counter--;
			}
		}
		
		System.out.println(counter);
	}
}
