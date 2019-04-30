import java.util.Scanner;

public class ColdputerScience {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int tempsCollected = sc.nextInt();

		for (int i = 1; i <= tempsCollected; i++)
		{
			int tempsInput = sc.nextInt();
			
			if (tempsInput < 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
