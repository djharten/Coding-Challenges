import java.util.Scanner;

public class Sibice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matches = sc.nextInt();
		double width = sc.nextInt();
		double height = sc.nextInt();
		
		double hypotenuse = Math.sqrt(Math.pow(width,2) + Math.pow(height,2));
		
		for(int i = 1; i <= matches; i++) {
			int matchLength = sc.nextInt();
				
				if(matchLength <= hypotenuse) {
					System.out.println("DA");
				} else {
					System.out.println("NE");
				}
		}
	}
}
