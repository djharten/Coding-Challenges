import java.util.Scanner;

public class Zamka {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int minInt = sc.nextInt();
		int maxInt = sc.nextInt();
		int sumOf = sc.nextInt();
		System.out.println(findMinInt(minInt, sumOf));
		System.out.println(findMaxInt(maxInt, sumOf));
	}

	public static int findMinInt(int min, int sum) {
		int minSum = 0;
		int origMin = min;

		while (minSum != sum) {
			if (origMin == 0) {
				min++;
				origMin = min;
				minSum = 0;
			}
			minSum += origMin % 10;
			origMin /= 10;
		}

		return min;

	}

	public static int findMaxInt(int max, int sum) {
		int maxSum = 0;
		int origMax = max;

		while (maxSum != sum) {
			
			if (origMax == 0) {
				max--;
				origMax = max;
				maxSum = 0;
				
			}
			
			maxSum += origMax % 10;
			origMax /= 10;
			
			if (maxSum >= sum && origMax > 0) {
				max--;
				origMax = max;
				maxSum = 0;
			}
		}

		return max;

	}

}
