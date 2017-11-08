import java.util.Arrays;
import java.util.Scanner;

public class Cetiri {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		
		Arrays.sort(arr);
		
		int difOne = Math.abs(arr[0]-arr[1]);
		int difTwo = Math.abs(arr[1]-arr[2]);
		
		if(difOne == difTwo) {
			System.out.println(difTwo+arr[2]);
		} else if(difOne / 2 == difTwo) {
			System.out.println(arr[0]+difTwo);
		} else if(difTwo / 2 == difOne) {
			System.out.println(arr[1] + difOne);
		}
		
	}

}
