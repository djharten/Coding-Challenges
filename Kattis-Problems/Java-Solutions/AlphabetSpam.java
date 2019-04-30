import java.util.Scanner;

public class AlphabetSpam {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		int whiteCounter = 0;
		int lowerCounter = 0;
		int upperCounter = 0;
		int symbolCounter = 0;
		
		String lowerLetters = "abcdefghijklmnopqrstuvwxyz";
		String upperLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == '_'){
				whiteCounter++;
			} else if(lowerLetters.contains(input.substring(i,i+1))) {
				lowerCounter++;
			} else if(upperLetters.contains(input.substring(i,i+1))) {
				upperCounter++;
			} else {
				symbolCounter++;
			}
		}
		
		double whitespace = makeCalculation(whiteCounter, input.length());
		double lowerCase = makeCalculation(lowerCounter, input.length());
		double upperCase = makeCalculation(upperCounter, input.length());
		double symbols = makeCalculation(symbolCounter, input.length());
		
		printResults(whitespace, lowerCase, upperCase, symbols);
		
	}

	public static double makeCalculation(double input, int length) {
		double percent = input / length;
		return percent;
	}
	
	public static void printResults(double white, double lCase, double uCase, double symb) {
		System.out.println(white);
		System.out.println(lCase);
		System.out.println(uCase);
		System.out.println(symb);
	}
}
