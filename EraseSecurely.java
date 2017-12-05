import java.util.Scanner;

public class EraseSecurely {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		StringBuilder begin = new StringBuilder(sc.nextLine());
		StringBuilder end = new StringBuilder(sc.nextLine());

		for (int j = 0; j < num; j++) {
			for (int i = 0; i < begin.length(); i++) {
				if (begin.charAt(i) == '1') {
					begin.setCharAt(i, '0');
				} else {
					begin.setCharAt(i, '1');
				}
			}
		}

		if (begin.toString().equals(end.toString())) {
			System.out.println("Deletion succeeded");
		} else {
			System.out.println("Deletion failed");
		}
	}
}
