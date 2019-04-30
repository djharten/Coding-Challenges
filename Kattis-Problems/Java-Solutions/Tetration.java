import java.util.Scanner;

public class Tetration {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		double ans = Math.pow(num, (1/num));
		System.out.println(ans);

	}

}
