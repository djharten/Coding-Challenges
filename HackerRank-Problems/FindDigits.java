import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static int findDigits(int n) {
		int divisible = 0;
		int modN = n;
		while (modN > 0) {
			int checkDiv = modN % 10;
			if (checkDiv != 0) {
				if (n % checkDiv == 0) {
					divisible++;
				}
			}
			modN /= 10;
		}
		return divisible;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int result = findDigits(n);
			System.out.println(result);
		}
		in.close();
	}
}
