import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class DeathKnightHero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int battles = sc.nextInt();
		sc.nextLine();

		int counter = 0;
		int battlesWon = 0;

		while (battles != counter) {
			String fight = sc.nextLine();
			Pattern check = Pattern.compile("CD");
			Matcher match = check.matcher(fight);

			battlesWon++;

			if (match.find()) {
				battlesWon--;
			}

			counter++;
		}
		System.out.println(battlesWon);
	}
}
