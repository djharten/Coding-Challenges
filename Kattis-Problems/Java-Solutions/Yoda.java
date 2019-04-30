import java.util.Scanner;

public class Yoda {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
		String input2 = sc.nextLine();

		String final1 = "";
		String final2 = "";

		int checkLength = 0;
		int extraLength1 = 0;
		int extraLength2 = 0;
		
		if (input1.length() > input2.length()) {
			checkLength = input2.length();
			extraLength1 = input1.length()-input2.length();
			extraLength2 = 0;
			final1 += input1.substring(0,extraLength1);
		} else {
			checkLength = input1.length();
			extraLength2 = input2.length()-input1.length();
			extraLength1 = 0;
			final2 += input2.substring(0, extraLength2);
		}

		for (int i = 0; i < checkLength; i++) {
			int check1 = input1.charAt(i+extraLength1) - '0';
			int check2 = input2.charAt(i+extraLength2) - '0';

			if (check1 >= check2) {
				final1 += check1;
				if(final1.length() > 1 && final1.charAt(0) == '0') {
					final1 = final1.substring(1);
				}
			}
			if(check2 >= check1){
				final2 += check2;
				if(final2.length() > 1 && final2.charAt(0) == '0') {
					final2 = final2.substring(1);
				}
			}
			
		}
		
		if(final1.length() == 0) {
			final1 += "YODA";
		}
		if(final2.length() == 0) {
			final2 += "YODA";
		}
		
		System.out.println(final1);
		System.out.println(final2);
	}
}
