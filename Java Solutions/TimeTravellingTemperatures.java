import java.util.Scanner;

public class TimeTravellingTemperatures {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		double temp = 0.0;
		
		if(x == 0 && y == 1) {
			System.out.println("ALL GOOD");
		} else if(y == 1) {
			System.out.println("IMPOSSIBLE");
		} else {
			temp = (double) x / ( (1.0 - (double) y));
			System.out.println(temp);
		}

	}

}
