import java.util.Scanner;

public class Datum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		int month = sc.nextInt();
		int totalDays = 0;

		if (month == 1) {
			totalDays = day;
		} else if (month == 2) {
			totalDays = 31 + day;
		} else if (month == 3) {
			totalDays = 59 + day;
		} else if (month == 4) {
			totalDays = 90 + day;
		} else if (month == 5) {
			totalDays = 120 + day;
		} else if (month == 6) {
			totalDays = 151 + day;
		} else if (month == 7) {
			totalDays = 181 + day;
		} else if (month == 8) {
			totalDays = 212 + day;
		} else if (month == 9) {
			totalDays = 243 + day;
		} else if (month == 10) {
			totalDays = 273 + day;
		} else if (month == 11) {
			totalDays = 304 + day;
		} else {
			totalDays = 334 + day;
		}

		int thurs = 1;
		int fri = 2;
		int sat = 3;
		int sun = 4;
		int mon = 5;
		int tue = 6;
		int wed = 7;

		String dayOfWeek = "";

		while (true) {
			if (thurs == totalDays) {
				dayOfWeek = "Thursday";
				break;
			} else if (fri == totalDays) {
				dayOfWeek = "Friday";
				break;
			} else if (sat == totalDays) {
				dayOfWeek = "Saturday";
				break;
			} else if (sun == totalDays) {
				dayOfWeek = "Sunday";
				break;
			} else if (mon == totalDays) {
				dayOfWeek = "Monday";
				break;
			} else if (tue == totalDays) {
				dayOfWeek = "Tuesday";
				break;
			} else if (wed == totalDays) {
				dayOfWeek = "Wednesday";
				break;
			}

			mon += 7;
			tue += 7;
			wed += 7;
			thurs += 7;
			fri += 7;
			sat += 7;
			sun += 7;
		}
		System.out.println(dayOfWeek);
	}

}
