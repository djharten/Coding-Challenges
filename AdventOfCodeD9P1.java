import java.util.Scanner;
import java.io.*;

public class AdventOfCodeD9P1 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("input.txt"));
		String input = sc.nextLine();

		int points = 1;
		int sum = 0;
		boolean checkGarbage = false;
		
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == '!') {
				i++;
			} else if(input.charAt(i) != '>' && checkGarbage) {
				checkGarbage == true;
			} else if(input.charAt(i) == '>') {
				checkGarbage = false;
			} else if(input.charAt(i) == '<') {
				checkGarbage = true;
			} else if(input.charAt(i) == '{') {
				sum += points;
				points++;
			} else if(input.charAt(i) == '}') {
				points--;
			}
		}	
		System.out.println(sum);
	}
}
