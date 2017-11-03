import java.util.Scanner;

public class Server {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numTasks = sc.nextInt();
		int totalMinutes = sc.nextInt();

		int accruedMinutes = 0;
		int counter = 0;

		for (int i = 1; i <= numTasks; i++) {
			int time = sc.nextInt();
			accruedMinutes += time;
			counter++;
			if (accruedMinutes > totalMinutes) {
				counter--;
			}
		}
		System.out.println(counter);
	}

}
