import java.util.Arrays;
import java.util.Scanner;

public class Kornislav {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[4];
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		arr[3] = sc.nextInt();
		
		Arrays.sort(arr);
		
		int largestArea = arr[0]*arr[2];
		
		System.out.println(largestArea);
	}
}
