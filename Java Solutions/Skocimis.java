import java.util.Scanner;

public class Skocimis {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		System.out.println(Math.max(y-x,z-y) - 1);
	}
}
