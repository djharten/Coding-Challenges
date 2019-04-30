import java.util.Scanner;

public class HelpAPhDCandidateOut {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < cases; i++) {
			String input = sc.nextLine();
			
			if(input.equals("P=NP")) {
				System.out.println("skipped");
			} else {
				String split[] = input.split("\\+");
				String first = split[0];
				String second = split[1];
				int numOne = Integer.parseInt(first);
				int numTwo = Integer.parseInt(second);
				System.out.println(numOne+numTwo);
				
			}
		}
	}
}
