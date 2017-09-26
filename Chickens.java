import java.util.Scanner;

public class Chickens {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String chickens = sc.nextLine();
		
		String[] inputList = chickens.split(" ");
		int people = Integer.parseInt(inputList[0]);
		int chicken = Integer.parseInt(inputList[1]);

		int total = chicken - people;
		
		if(total == 1) {
			System.out.println("Dr. Chaz will have " + total + " piece of chicken left over!");
		} else if(total > 1 || total == 0) {
			  System.out.println("Dr. Chaz will have " + total + " pieces of chicken left over!");	
		} else if(total == -1) {
			total = total * -1;
			System.out.println("Dr. Chaz needs " + total + " more piece of chicken!");
		} else {
			total = total * -1;
			System.out.println("Dr. Chaz needs " + total + " more pieces of chicken!");
		}

	}

}
