// https://projecteuler.net/problem=4

public class LargestPalindromeProduct {
	public static void main(String[] args) {
		int num1 = 999;
		int num2 = 999;
		int product = 0;
		int maxPal = 0;

		for (int i = 0; i < 999; i++) {
			product = num1 * num2;
			num2--;
			String reg = Integer.toString(product);
			String rev = Integer.toString(product);
			String reverse = new StringBuilder(rev).reverse().toString();

			if (reverse.toString().equals(reg) && product > maxPal) {
				maxPal = product;
				num1--;
				num2 = num1 - 1;
				i = 0;
			}

			if (num2 == 2) {
				num1--;
				num2 = num1 - 1;
				i = 0;
			}
		}
		System.out.println(maxPal);
	}

}
