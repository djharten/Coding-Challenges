import java.util.Scanner;

public class AnthonyAndDiablo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double area = sc.nextDouble();
		double fencing = sc.nextDouble();
		
		double rads = fencing / (2*Math.PI);
		double finalArea = Math.PI * (Math.pow(rads, 2));
		
		if(finalArea >= area) {
			System.out.println("Diablo is happy!");
		} else {
			System.out.println("Need more materials!");
		}

	}

}
