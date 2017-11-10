import java.util.Scanner;

public class OneChickenPerPerson {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int people = sc.nextInt();
		int chicken = sc.nextInt();
		
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
