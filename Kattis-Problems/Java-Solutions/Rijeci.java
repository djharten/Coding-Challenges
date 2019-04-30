import java.util.Scanner;

public class Rijeci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int press = sc.nextInt();
		int fib = 1;
		int a = 1; 
		int b = 2;
		if(press == 1) {
			System.out.println("0 1");
		} else if(press == 2) {
			System.out.println("1 1");
		} else if(press == 3) {
			System.out.println("1 2");
		} else {
			for(int i = 3; i < press; i ++) {
				int tempFib = fib;
				b += a;
				fib = a;
				a += tempFib;
			}
			System.out.println(a + " " + b);
		}
		
		
	}

}
