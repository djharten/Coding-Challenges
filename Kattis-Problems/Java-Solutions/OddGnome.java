import java.util.Scanner;

public class OddGnome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		
		while(cases !=0) {
			int numGnomes = sc.nextInt();
			
			int arr[] = new int[numGnomes];
			for(int k = 0; k < numGnomes; k++) {
				arr[k] = sc.nextInt();
			}
			
			int perGnome = (arr[numGnomes-1] - arr[0]) / (numGnomes-2);
			
			for(int i  = 0; i < numGnomes; i++) {
			
				if(arr[i]+perGnome != arr[i+1]) {
					System.out.println(i+2);
					break;
					
				}
			}
			cases--;
		}
	}
}
