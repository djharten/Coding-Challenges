import java.util.Scanner;

public class R2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] inputList = input.split(" ");
		int r1 = Integer.parseInt(inputList[0]);
		int s = Integer.parseInt(inputList[1]);
		
		int r2 = 2*s - r1;
		
		System.out.println(r2);
		
	}

}
