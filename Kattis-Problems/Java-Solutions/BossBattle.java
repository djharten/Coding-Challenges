import java.util.Scanner;

public class BossBattle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pillars = sc.nextInt();
		
		if(pillars > 3) {
			System.out.println(pillars-2);
		} else {
			System.out.println("1");
		}
	}
}
