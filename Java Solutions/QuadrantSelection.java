import java.util.Scanner;

public class QuadrantSelection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		
		if(first > 0 && second > 0) {
			System.out.println("1");
		} else if(first < 0 && second > 0) {
			System.out.println("2");
		} else if(first < 0 && second < 0) {
			System.out.println("3");
		} else {
			System.out.println("4");
		}
	}

}
