import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class AdventOfCodeD16P1 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("input.txt"));

		String letters = "abcdefghijklmnop";
		String arr[] = sc.next().split(",");

		for (int i = 0; i < arr.length; i++) {
			char choice = arr[i].charAt(0);
			String values = arr[i].substring(1);
			String indValues[] = values.split("/");

			if (choice == 's') {
				int placeMoved = Integer.parseInt(indValues[0]);
				String splitWordOne = letters.substring(letters.length() - placeMoved);
				String splitWordTwo = letters.substring(0, letters.length() - placeMoved);
				letters = splitWordOne + splitWordTwo;
			} else if (choice == 'x') {
				int numOne = Integer.parseInt(indValues[0]);
				int numTwo = Integer.parseInt(indValues[1]);
				char letterOne = letters.charAt(numOne);
				char letterTwo = letters.charAt(numTwo);
				char moveLetter = letters.charAt(numTwo);
				StringBuilder sbLetters = new StringBuilder(letters);
				sbLetters.setCharAt(numTwo, letterOne);
				sbLetters.setCharAt(numOne, moveLetter);
				letters = sbLetters.toString();
			} else {
				int num = 0;
				int firstLetterLoc = 0;
				int secondLetterLoc = 0;
				char letterOne = indValues[0].charAt(0);
				char letterTwo = indValues[1].charAt(0);
				String partOne = indValues[0];
				String partTwo = indValues[1];

				while (true) {
					char testLetter = letters.charAt(num);
					if (testLetter == letterOne) {
						firstLetterLoc = num;
						num = 0;
						break;
					} else {
						num++;
					}
				}

				while (true) {
					char testLetter = letters.charAt(num);
					if (testLetter == letterTwo) {
						secondLetterLoc = num;
						num = 0;
						break;
					} else {
						num++;
					}
				}
				StringBuilder sbLetters = new StringBuilder(letters);
				sbLetters.setCharAt(firstLetterLoc, letterTwo);
				sbLetters.setCharAt(secondLetterLoc, letterOne);
				letters = sbLetters.toString();
			}
		}
		 System.out.println(letters);
	}

}
