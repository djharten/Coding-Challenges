// http://adventofcode.com/2017/day/5

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AdventOfCodeD5P2 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new File("numbers.txt."));

		ArrayList<Integer> nums = new ArrayList<Integer>();

		while (sc.hasNext()) {
			int num = sc.nextInt();
			nums.add(num);
		}

		int steps = 0;
		int current = 0;
		int arrNum = 0;
		int last = nums.size();

		while (current < last) {
			arrNum = nums.get(current);
			current += arrNum;
			steps++;
			if (current > last || current < 0) {
				break;
			}

			if (arrNum >= 3) {
				nums.set(current - arrNum, arrNum - 1);
			} else {
				nums.set(current - arrNum, arrNum + 1);
			}
		}
		System.out.println(steps);
	}
}
