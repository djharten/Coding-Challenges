public class SumSquareDifference {
	public static void main(String[] args) {
		int sumSquares = 0;
		int squareSum = 0;

		for (int i = 1; i <= 100; i++) {
			sumSquares += Math.pow(i, 2);
			squareSum += i;
		}

		int squareSumTotal = (int) Math.pow(squareSum, 2);

		System.out.println(squareSumTotal - sumSquares);
	}
}
