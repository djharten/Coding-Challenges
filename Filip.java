import java.util.Scanner;

public class Filip {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int numOne = sc.nextInt();
		int numTwo = sc.nextInt();

		String stringNumOne = Integer.toString(numOne);
		String stringNumTwo = Integer.toString(numTwo);
		
		String reverseOne = new StringBuilder(stringNumOne).reverse().toString();
		String reverseTwo = new StringBuilder(stringNumTwo).reverse().toString();
		
		int finalOne = Integer.parseInt(reverseOne);
		int finalTwo = Integer.parseInt(reverseTwo);
		
		if(finalOne > finalTwo) {
			System.out.println(finalOne);
		} else {
			System.out.println(finalTwo);
		}

	}

}
