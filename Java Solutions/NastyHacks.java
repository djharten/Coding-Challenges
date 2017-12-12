import java.util.Scanner;

public class NastyHacks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		
		for(int i = 1; i <= tests; i++) {
			int noAd = sc.nextInt();
			int yesAd = sc.nextInt();
			int adCost = sc.nextInt();
			
				if(yesAd - adCost > noAd) {
					System.out.println("advertise");
				} else if(noAd > yesAd - adCost) {
					System.out.println("do not advertise");
				} else {
					System.out.println("does not matter");
				}
		}
	}
}
