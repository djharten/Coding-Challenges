import java.util.Scanner;

public class HissingMicrophone {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		int counter = 0;
		
		for(int i = 0; i < input.length()-1; i++) {
			if(input.substring(i, i+2).equals("ss")) {
				counter++;
			}
		}
		
		if(counter > 0) {
			System.out.println("hiss");
		} else {
			System.out.println("no hiss");
		}

	}

}
