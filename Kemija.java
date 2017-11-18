import java.util.Scanner;

public class Kemija {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		input = input.replace("epe", "e");
		input = input.replace("apa", "a");
		input = input.replace("opo", "o");
		input = input.replace("ipi", "i");
		input = input.replace("upu", "u");
		
		System.out.println(input);

	}
}
