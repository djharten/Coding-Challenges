import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static String kangaroo(int x1, int v1, int x2, int v2) {
		String ans = "";
		while (true) {
			if (x1 < x2 && v1 <= v2) {
				ans = "NO";
				break;
			} else if (x1 > x2) {
				ans = "NO";
				break;
			} else {
				x1 += v1;
				x2 += v2;
			}
			if(x1 == x2) {
				ans = "YES";
				break;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();
		String result = kangaroo(x1, v1, x2, v2);
		System.out.println(result);
	}
}
