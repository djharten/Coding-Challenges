import java.util.Arrays;
import java.util.Scanner;

public class OddManOut {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		int counter = 1;
		
		for(int i = 0; i < testCases; i++) {
			int guests = sc.nextInt();
			int arr[] = new int[guests];
			guestInfo(arr, sc);
			printResult(findAloneGuest(arr),counter);
			counter++;
		}
	}
	
	public static void guestInfo(int arr[], Scanner input) {
		for(int k = 0; k < arr.length; k++) {
			arr[k] = input.nextInt();
		}
	}
	
	public static int findAloneGuest(int arr[]) {
		int aloneGuest = 0;
		
		for(int i : arr) {
			aloneGuest ^= i;
		}
		
		return aloneGuest;
	}
	
	public static void printResult(int guest, int counter) {
		System.out.println("Case #" + counter + ": " + guest);
	}

}
