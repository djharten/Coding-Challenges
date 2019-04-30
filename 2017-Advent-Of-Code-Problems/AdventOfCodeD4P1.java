// http://adventofcode.com/2017/day/4

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class AdventOfCodeD4P1 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new File("passphrase.txt"));

		int validPass = 0;

		while (sc.hasNextLine()) {

			ArrayList<String> checkWords = new ArrayList<String>();

			String line = sc.nextLine();
			Scanner lineCheck = new Scanner(line);

			while (lineCheck.hasNext()) {
				String word = lineCheck.next();
				System.out.println(word);
				checkWords.add(word);
			}

			int count = 0;

			for (int i = 0; i < checkWords.size(); i++) {

				if (checkWords.get(count).equals(checkWords.get(i)) && i != count) {
					validPass--;
					break;
				}

				if (i == checkWords.size() - 1) {
					i = -1;
					count++;
				}
				
				if(count == checkWords.size()-1) {
					break;
				}

			}

			validPass++;
			count = 0;
		}
		System.out.println(validPass);
	}

}
