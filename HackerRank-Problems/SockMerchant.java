import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	static int sockMerchant(int n, int[] ar) {
		Arrays.sort(ar);
		int count = 1;
		int numPairs = 0;
		for (int i = 0; i < ar.length - 1; i++) {
			if (ar[i] == ar[i+1]) {
				count++;
				if (i+1 == ar.length-1) {
					numPairs += count / 2;
					break;
				}
			} else {
				numPairs += count / 2;
				count = 1;
			}
		}
		return numPairs;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		int result = sockMerchant(n, ar);
		System.out.println(result);
	}
}
