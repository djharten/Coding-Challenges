// https://projecteuler.net/problem=10

import java.math.BigInteger;

public class SummationOfPrimes {
	public static void main(String[] args) {

		BigInteger sum = new BigInteger("2");
		boolean primeCheck = true;

		for (int i = 3; i < 2000000; i++) {
			 int check = (int) Math.sqrt(i);
			for (int k = 2; k <= check; k++) {
				if (i % k == 0) {
					primeCheck = false;
					break;
				}
			}

			if (primeCheck) {
				sum = sum.add(BigInteger.valueOf(i));
			}
			primeCheck = true;
		}
		System.out.println(sum);
	}
}
