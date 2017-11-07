import java.util.Scanner;

public class Trik {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		int loc = 1;
		
		for(int i = 0; i < input.length(); i++){
			if(loc == 1 && input.charAt(i) == 'A') {
				loc = 2;
			} else if(loc == 1 && input.charAt(i) == 'C') {
				loc = 3;
			} else if(loc == 2 && input.charAt(i) == 'A') {
				loc = 1;
			} else if(loc == 2 && input.charAt(i) == 'B') {
				loc = 3;
			} else if(loc == 3 && input.charAt(i) == 'C') {
				loc = 1;
			} else if(loc == 3 && input.charAt(i) == 'B') {
				loc = 2;
			}
		}
		
		System.out.println(loc);
		
	}

}
