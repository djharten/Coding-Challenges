// https://projecteuler.net/problem=3

public class LargestPrimeFactor {
	public static void main(String[] args) {
		long num = 600851475143L;
		long maxPrime = 0L;

		for (long i = 2L; i <= num; i++) {
			for (long k = 1L; k <= Math.sqrt(i); k++) {
				if (k % i == 0) {
					break;
				} else {
					while (num % i == 0) {
						num /= i;
						maxPrime = i;
					}
				}
			}
		}
		System.out.println(maxPrime);
	}

}
