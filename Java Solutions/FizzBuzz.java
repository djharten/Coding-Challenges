import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fizzDivisible = sc.nextInt();
		int buzzDivisible = sc.nextInt();
		int cases = sc.nextInt();
		
		for(int i = 1; i <= cases; i++) {
			if(i % fizzDivisible == 0 && i % buzzDivisible == 0) {
				System.out.println("FizzBuzz");
			} else if(i % fizzDivisible == 0) {
				System.out.println("Fizz");;
			} else if(i % buzzDivisible == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
}
