import java.util.Scanner;

public class Autori {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] inputList = input.split("-");
		for(String s : inputList ) {
			System.out.print(s.charAt(0));
		}
	}
}
