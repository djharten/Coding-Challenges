import java.util.Scanner;

public class Mjehuric {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		int check[] = new int[5];
		
		for(int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
			check[i] = i+1;
		}
		
		int placeholder = 0;
		
		while(true) {
			if(arr[0] > arr[1]) {
				placeholder = arr[1];
				arr[1] = arr[0];
				arr[0] = placeholder;
				for(int k = 0; k < 4; k++) {
					System.out.print(arr[k] + " ");
				}
				System.out.println(arr[4]);
			}
			if(arr[1] > arr[2]) {
				placeholder = arr[2];
				arr[2] = arr[1];
				arr[1] = placeholder;
				for(int k = 0; k < 4; k++) {
					System.out.print(arr[k] + " ");
				}
				System.out.println(arr[4]);
			}
			if(arr[2] > arr[3]) {
				placeholder = arr[3];
				arr[3] = arr[2];
				arr[2] = placeholder;
				for(int k = 0; k < 4; k++) {
					System.out.print(arr[k] + " ");
				}
				System.out.println(arr[4]);
			}
			if(arr[3] > arr[4]) {
				placeholder = arr[4];
				arr[4] = arr[3];
				arr[3] = placeholder;
				for(int k = 0; k < 4; k++) {
					System.out.print(arr[k] + " ");
				}
				System.out.println(arr[4]);
			}
			
			if(arr[0] == check[0] && arr[1] == check[1] && arr[2] == check[2] && arr[3] == check[3] && arr[4] == check[4]) {
				break;
			}
		}

	}

}
