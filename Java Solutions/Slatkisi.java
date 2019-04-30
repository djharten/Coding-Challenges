import java.util.Scanner;

public class Slatkisi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		int bill = sc.nextInt();

		int zeros = (int) Math.pow(10, bill);
		double roundedNumber = ((price + (0.5*zeros)) / (1*zeros)) * (1*zeros);
		
		price = (int) (roundedNumber/zeros)*zeros;
		System.out.println(price);
	}
}
