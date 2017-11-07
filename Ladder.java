import java.util.Scanner;

public class Ladder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int degrees = sc.nextInt();
		
		double rads = degrees * (Math.PI / 180);
		double cosecant = (1/Math.sin(rads));
		
		int ladder = (int) Math.ceil(cosecant * height);
		
		System.out.println(ladder);

	}

}
