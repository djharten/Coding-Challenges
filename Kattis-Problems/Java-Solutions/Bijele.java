import java.util.Scanner;

public class Bijele {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] pieces = {1, 1, 2, 2, 2, 8};
		for(int i = 0; i < 6; i++) {
			int val = sc.nextInt();
			System.out.print( (pieces[i] - val) + " ");
		}
	}
}
