import java.util.Scanner;

public class QuiteAProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			String line = sc.nextLine().toLowerCase();
			
			if(line.contains("problem")) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
			
		}
	}

}
