import java.util.Scanner;

public class Volim {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int boxOwner = sc.nextInt();
		int numQuestions = sc.nextInt();
		sc.nextLine();
		
		
		int totalTimer = 210;
		int finalOwner = 0;
		
		for(int i = 0; i < numQuestions; i++) {
			String input = sc.nextLine();
			String split[] = input.split(" ");
			int timer = Integer.parseInt(split[0]);
			String result = split[1];
			char letter = result.charAt(0);
			
			if(letter == 'T') {
				totalTimer -= timer;
				boxOwner++;
				if(totalTimer < 0) {
					boxOwner--;
				}
					if(boxOwner > 8) {
						boxOwner = 1;
					}
			} else if(letter == 'N') {
				totalTimer -= timer;
			} else {
				totalTimer -= timer;
			}
			
			if(totalTimer < 0) {
				finalOwner = boxOwner;
				totalTimer = 999999999;
			}
		
		}
		
		System.out.println(finalOwner);
		
	}
}
