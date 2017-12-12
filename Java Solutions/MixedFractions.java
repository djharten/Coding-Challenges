import java.util.Scanner;

public class MixedFractions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int den = sc.nextInt();

		while (num != 0 && den != 0) {

			int wholeNum = num / den;
			int remainder = num % den;

			if (wholeNum == 0) {
				System.out.println("0 " + num + " / " + den);
			} else {
				System.out.println(wholeNum + " " + remainder + " / " + den);
			}
			
			num = sc.nextInt();
			den = sc.nextInt();
		}

	}

}
