import java.util.Arrays;
import java.util.Scanner;

public class FallingApart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numPieces = sc.nextInt();
		int arrNums[] = new int[numPieces];

		for (int i = 0; i < numPieces; i++) {
			arrNums[i] = sc.nextInt();
		}

		Arrays.sort(arrNums);

		int aliceSum = 0;
		int bobSum = 0;

		if (numPieces % 2 != 0) {
			for (int k = numPieces - 1; k >= 0; k--) {
				if (k % 2 == 0) {
					aliceSum += arrNums[k];
				} else {
					bobSum += arrNums[k];
				}
			}
			System.out.println(aliceSum + " " + bobSum);
		} else {
			for (int k = numPieces - 1; k >= 0; k--) {
				if (k % 2 == 0) {
					bobSum += arrNums[k];
				} else {
					aliceSum += arrNums[k];
				}
			}
			System.out.println(aliceSum + " " + bobSum);
		}
	}
}
