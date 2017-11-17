// https://projecteuler.net/problem=9

public class SpecialPythagoreanTriplet {
	public static void main(String[] args) {

		int a,b,c;

		for (int i = 1; i <= 1000; i++) {
			for (int k = i + 1; k <= 1000; k++) {
				a = (int) Math.pow(k, 2) - (int) Math.pow(i, 2);
				b = 2*i*k;
				c = (int) Math.pow(k, 2) + (int) Math.pow(i, 2);
				if (a + b + c == 1000) {
					System.out.println(a * b * c);
					break;
				}
				if (a + b + c == 1000) {
					break;
				}
			}
		}
	}
}
