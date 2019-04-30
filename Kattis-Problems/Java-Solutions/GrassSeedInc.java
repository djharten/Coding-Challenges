import java.util.Scanner;

public class GrassSeedInc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cost = sc.nextDouble();
		int lawns = sc.nextInt();
		
		double total = 0;
		
		for(int i = 1; i <= lawns; i++) {
			double width = sc.nextDouble();
			double length = sc.nextDouble();
			
			double subtotal = (width*length) * cost;
			
			total = total + subtotal;
		}	
		System.out.println(total);
	}
}
