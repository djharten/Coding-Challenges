import java.util.Scanner;

public class LineThemUp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		sc.nextLine();
		
		String[] names = new String[cases];
		
		for(int j = 0; j < names.length; j++) {
			names[j] = sc.nextLine();
		}
		
		boolean increasing = false;
		boolean decreasing = false;
		boolean neither = false;

		for (int i = 0; i < cases - 1; i++) {
			
			char nameOne = names[i].charAt(0);
			char nameTwo = names[i + 1].charAt(0);

			int count = 0;

			while (nameOne == nameTwo) {
				count++;
				nameOne = names[i].charAt(count);
				nameTwo = names[i + 1].charAt(count);
			}
			
			int valOne = (int) nameOne;
			int valTwo = (int) nameTwo;
			
			if(valOne > valTwo) {
				decreasing = true;
				if(increasing == true) {
					neither = true;
					break;
				}
			} else {
				increasing = true;
				if(decreasing == true) {
					neither = true;
					break;
				}
			}
		}
		
		if(neither) {
			System.out.println("NEITHER");
		} else if(increasing) {
			System.out.println("INCREASING");
		} else {
			System.out.println("DECREASING");
		}

	}

}
