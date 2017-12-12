import java.util.Scanner;

public class Eligibility {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		sc.nextLine();
		
		while(cases != 0) {
			
			String input = sc.nextLine();
			String arr[] = input.split("\\W");
			
			int y1 = Integer.parseInt(arr[1]);
			int y2 = Integer.parseInt(arr[4]);
			int courses = Integer.parseInt(arr[7]);
			
				if(y1 >= 2010 || y2 >= 1991) {
					System.out.println(arr[0] + " eligible");
				} else if(courses > 40) {
					System.out.println(arr[0] + " ineligible");
				} else {
					System.out.println(arr[0] + " coach petitions");
				}
			cases--;
		}
	}
}
