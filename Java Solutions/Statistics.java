import java.util.Arrays;
import java.util.Scanner;

public class Statistics {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCase = 1;
		
		while (sc.hasNext()) {
			
			int cases = sc.nextInt();
			int arr[] = new int[cases];

			for (int i = 0; i < cases; i++) {
				arr[i] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			int max = arr[arr.length-1];
			int min = arr[0];
			int range = arr[arr.length-1] - arr[0];
			
			System.out.println("Case " + numCase + ": " + min + " " + max + " " + range);
			numCase++;
		}
	}

}
