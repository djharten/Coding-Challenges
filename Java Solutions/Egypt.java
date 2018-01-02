import java.util.Arrays;
import java.util.Scanner;

public class Egypt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		while(a != 0 && b != 0 && c != 0) {
			
			int nums[] = new int[3];
			nums[0] = a;
			nums[1] = b;
			nums[2] = c;
			Arrays.sort(nums);
			
			if((Math.pow(nums[0], 2) + Math.pow(nums[1], 2)) == Math.pow(nums[2],2)) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
			
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
		}
	}
}

