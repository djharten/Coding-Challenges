import java.util.Scanner;

public class JustAMinute {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		double mins = 0;
		double totalTime = 0;
		
		for(int i = 0; i < cases; i++) {
			mins += sc.nextInt();
			totalTime += sc.nextInt();
		}
		
		double jMinute = totalTime / (mins*60);
		
		if(jMinute > 1) {
			System.out.println(jMinute);
		} else {
			System.out.println("measurement error");
		}
		
	}

}
