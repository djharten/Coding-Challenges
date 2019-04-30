// https://projecteuler.net/problem=2

public class EvenFibonacciNumbers {
	public static void main(String[] args) {
		int sum = 0;
		int fib1 = 1;
		int fib2 = 2;
		int newFib = 0;
		while (newFib < 4000000) {
			newFib = fib1 + fib2;
			fib1 = fib2;
			fib2 = newFib;
			if (newFib % 2 == 0) {
				sum += newFib;
			}
		}
		System.out.println(sum);
	}
}
