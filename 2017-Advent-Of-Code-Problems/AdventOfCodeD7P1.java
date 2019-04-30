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

		for (int i = 0; i < arr.length; i++) {

			line = arr[i];

			if (line.contains(" ")) {
				line = line.substring(0, line.indexOf(" "));
			}

			int count = 0;

			while (true) {

				String newLine = arr[count];

				if (newLine.contains(line) && count != i) {
					break;
				} else if (count == arr.length - 1) {
					System.out.println(line);
					break;
				}
				count++;
			}
		}
	}
}