import java.util.Scanner;

public class Pot {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int numberInt = sc.nextInt();
		int count = 0;
		long total = 0;
		
		for(int i=1; i <= numberInt; i++){
			int intInput = sc.nextInt();
			int intInputPow = (int) Math.pow(intInput/10, intInput % 10);
			total = total + intInputPow;
		}
		
		System.out.println(total);
		
	}
}
