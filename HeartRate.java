import java.util.Scanner;

public class HeartRate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();

		while (cases != 0) {
			int beats = sc.nextInt();
			double time = sc.nextDouble();

			double bpm = (beats * 60) / time;
			double delta = bpm / beats;

			System.out.printf("%.4f %.4f %.4f\n", (bpm - delta), bpm, (bpm + delta));

			cases--;
		}
	}
}
