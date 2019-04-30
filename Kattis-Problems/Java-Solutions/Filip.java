import java.util.Scanner;

public class Filip {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		String numOne = new String(new StringBuilder(sc.next()).reverse());
		String numTwo = new String(new StringBuilder(sc.next()).reverse());
		
		int finalOne = Integer.parseInt(numOne);
		int finalTwo = Integer.parseInt(numTwo);
		
		if(finalOne > finalTwo) {
			System.out.println(finalOne);
		} else {
			System.out.println(finalTwo);
		}
	}
}
