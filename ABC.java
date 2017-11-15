import java.util.Arrays;
import java.util.Scanner;

public class ABC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];
		for(int i = 0; i < 3; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		sc.nextLine();
		String letters = sc.nextLine();
		
		int orderedArr[] = new int[3];
		
		for(int k = 0; k < 3; k++) {
			if(letters.charAt(k) == 'A') {
				orderedArr[k] = arr[0];
			} else if(letters.charAt(k) == 'B') {
				orderedArr[k] = arr[1];
			} else {
				orderedArr[k] = arr[2];
			}
		}
		
		int num1 = orderedArr[0];
		int num2 = orderedArr[1];
		int num3 = orderedArr[2];
		
		System.out.println(num1 + " " + num2 + " " + num3);
	}

}
