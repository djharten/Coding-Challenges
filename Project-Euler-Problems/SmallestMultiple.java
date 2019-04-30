// https://projecteuler.net/problem=5

public class SmallestMultiple {

	public static void main(String[] args) {
		int num = 2520;
		int divCount = 1;
		boolean check = true;

		while (check) {
			if (num % divCount == 0) {
				divCount++;
				if (divCount == 20) {
					check = false;
				}
			} else {
				num++;
				divCount = 1;
			}
		}
		System.out.println(num);
	}
}
