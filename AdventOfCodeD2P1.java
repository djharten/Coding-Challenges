//http://adventofcode.com/2017/day/2

import java.util.Scanner;
import java.io.*;

public class AdventOfCodeD2P1 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("numbers.txt"));

		int sum = 0;
		int lowest = 99999999;
		int highest = 0;
		int num = 0;

		while (sc.hasNextLine()) {

			String list = sc.nextLine();
			Scanner input = new Scanner(list);

			while (input.hasNext()) {

				if (input.hasNextInt()) {
					num = input.nextInt();
				}

				if (num > highest) {
					highest = num;
				}

				if (num < lowest) {
					lowest = num;
				}

			}

			sum += highest - lowest;
			highest = 0;
			lowest = 99999999;

		}
		System.out.println(sum);
	}
}
