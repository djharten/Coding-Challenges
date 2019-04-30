import java.util.Scanner;

public class Cokolada {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numSquares = sc.nextInt();

		int barSize = 1;
		int breaks = 0;

		if (Integer.bitCount(numSquares) == 1) {
			System.out.println(numSquares + " " + breaks);
		} else {
			while (barSize < numSquares) {
				barSize *= 2;
			}
			String last = Integer.toBinaryString(numSquares);
			System.out.println(barSize + " " + (last.lastIndexOf("1") + 1));
		}

	}
}
