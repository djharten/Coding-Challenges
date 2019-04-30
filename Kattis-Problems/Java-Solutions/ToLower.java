import java.util.Scanner;

public class ToLower {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int problems = sc.nextInt();
		int cases = sc.nextInt();
		sc.nextLine();
		int solved = 0;
		
		for(int i = 0; i < problems; i++) {
			String input = "";
			for(int j = 0; j < cases; j++) {
				String line = sc.nextLine();
				line = line.substring(0,1).toLowerCase() + line.substring(1);
				input += line;
			}
			String lowerLine = input.toLowerCase();
			if(input.equals(lowerLine)) {
				solved++;
			}
		}
		System.out.println(solved);
	}

}
