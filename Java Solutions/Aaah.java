import java.util.Scanner;

public class Aaah {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
		String input2 = sc.nextLine();
		
		if(input1.length() >= input2.length()) {
			System.out.println("go");
		} else {
			System.out.println("no");
		}

	}

}
