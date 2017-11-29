import java.math.BigInteger;
import java.util.Scanner;

public class AnotherCandies {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();

		for(int i = 0; i < cases; i++){

			int numC = sc.nextInt();
			
			BigInteger sum = BigInteger.ZERO;

			for (int k = 0; k < numC; k++) {
				sum = sum.add(BigInteger.valueOf(sc.nextLong()));
			}

			if (sum.remainder(BigInteger.valueOf(numC)).equals(BigInteger.ZERO)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}
	}
}