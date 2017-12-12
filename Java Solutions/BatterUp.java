import java.util.Scanner;

public class BatterUp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int atBats = sc.nextInt();
		
		int origAtBats = atBats;
		int count = 0;
		double total = 0;
		
		for(int i = 1; i <= origAtBats; i++) {
			count = sc.nextInt();
			if(count == -1) {
				atBats--;
			} else {
				total += count;
			}
		}
		
		System.out.println(total/atBats);
		
	}

}
