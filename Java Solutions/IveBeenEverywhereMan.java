import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class IveBeenEverywhereMan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < testCases; i++) {
			ArrayList<String> listCities = new ArrayList();
			int cities = sc.nextInt();
			sc.nextLine();

			for (int k = 0; k < cities; k++) {
				String city = sc.nextLine();
				listCities.add(city);
			}

			int counter = 1;
			int distinctCities = 1;

			while (listCities.size() != counter) {

				Collections.sort(listCities);
				if (listCities.size() == 1) {
					break;
				} else if (!listCities.get(counter - 1).equals(listCities.get(counter))) {
					distinctCities++;
				}

				counter++;

			}
			System.out.println(distinctCities);
			distinctCities = 1;
		}
	}
}
