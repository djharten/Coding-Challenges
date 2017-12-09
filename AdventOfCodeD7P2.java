//This was not an exact solution to AoC's Day 7 Pt. 2 problem, but it was however
//used to create proper formatting for WebGraphViz.com. After putting it into a tree
//I manually found the answer.

import java.util.Scanner;
import java.io.*;

public class AdventOfCodeD7P1 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("input.txt"));
		String arr[] = new String[1868];

		String line = "";

		for (int k = 0; k < arr.length; k++) {
			arr[k] = sc.nextLine();
		}

		for (int j = 0; j < arr.length; j++) {

			line = arr[j];
			String nextLine = arr[j];
			String finalLine = arr[j];

			if (line.contains(" ")) {
				line = line.substring(0, line.indexOf(" "));
			}

			if (nextLine.contains(">")) {
				nextLine = nextLine.substring(nextLine.lastIndexOf(">") + 2);
				String[] words = nextLine.split(", ");
				for (int k = 0; k < words.length; k++) {
					System.out.println(line + " -> " + words[k]);
				}
			} else {
				nextLine = nextLine.substring(0, nextLine.indexOf(" "));
			}

		}

		for (int i = 0; i < arr.length; i++) {

			line = arr[i];
			String nextLine = arr[i];
			String finalLine = arr[i];

			if (line.contains(" ")) {
				line = line.substring(0, line.indexOf(" "));
			}

			finalLine = finalLine.substring(finalLine.indexOf("(") + 1, finalLine.indexOf(")"));
			System.out.println(line + "[label=\"" + line + "(" + finalLine + ")" + "[" + finalLine + "]\"]");
		}
	}
}
