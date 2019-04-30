import java.util.Arrays;
import java.util.Scanner;

public class NoDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();

		String arr[] = input.split(" ");
		Arrays.sort(arr);

		int counter = 0;
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1].equals(arr[i])) {
				counter++;
			}
		}

		if (counter >= 1) {
			System.out.println("no");
		} else {
			System.out.println("yes");
		}
	}
}
