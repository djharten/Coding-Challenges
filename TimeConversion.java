import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static String timeConversion(String s) {
		int hours = Integer.parseInt(s.substring(0, 2));
		String milTime = "";
		if (hours != 12 && s.substring(8).equals("PM")) {
			hours += 12;
			milTime = Integer.toString(hours) + ":" + s.substring(3, 5) + ":" + s.substring(6, 8);
		} else if (hours == 12 && s.substring(8).equals("AM")) {
			milTime = "00:" + s.substring(3, 5) + ":" + s.substring(6, 8);
		} else {
			milTime = s.substring(0, 8);
		}
		return milTime;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = timeConversion(s);
		System.out.println(result);
	}
}
