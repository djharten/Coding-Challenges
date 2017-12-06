import java.util.Scanner;

public class Skocimis {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = getNums(sc);
		System.out.println(Math.max(arr[1]-arr[0],arr[2]-arr[1]) - 1);
	}
	
	public static int[] getNums(Scanner input) {
		int arr[] = new int[3];
		
		for(int i = 0; i < 3; i++) {
			int num = input.nextInt();
			arr[i] = num;
		}
		
		return arr;

	}
}
