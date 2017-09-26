import java.util.Scanner;

public class Carrots {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] inputList = input.split(" ");
		int contestants = Integer.parseInt(inputList[0]);
		int problemsSolved = Integer.parseInt(inputList[1]);
		
		
		for(int i = 1; i <= contestants; i++){
			String description = sc.nextLine();
		}
			
		System.out.println(problemsSolved);
	}

}
