// https://projecteuler.net/problem=7

public class TenThousandAndFirstPrime {
	public static void main(String[] args) {
		int count = 2;
		int prime = 0;
		int primeCounter = 0;
		int totPrimes = 0;

		for(int k = 0; totPrimes < 10001; k++) {
			for (int i = 2; i <= count; i++) {
				if (count % i == 0) {
					primeCounter++;
				}
			}
			if (primeCounter > 1) {
				primeCounter = 0;
			} else {
				prime = count;
				primeCounter = 0;
				totPrimes++;
			}
			count++;
		}
		System.out.println(prime);
	}
}