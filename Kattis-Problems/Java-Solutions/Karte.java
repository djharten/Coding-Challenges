import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Karte {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		ArrayList<String> p = new ArrayList<String>();
		ArrayList<String> k = new ArrayList<String>();
		ArrayList<String> h = new ArrayList<String>();
		ArrayList<String> t = new ArrayList<String>();

		int count = input.length() / 3;

		while (count != 0) {

			String letter = input.substring(0, 1);
			char c = letter.charAt(0);
			String splitInput = input.substring(1, 3);
			input = input.substring(3);

			if (c == 'P') {
				p.add(splitInput);
			} else if (c == 'K') {
				k.add(splitInput);
			} else if (c == 'H') {
				h.add(splitInput);
			} else {
				t.add(splitInput);
			}
			count--;
		}

		if (!checkDuplicate(p) || !checkDuplicate(k) || !checkDuplicate(h) || !checkDuplicate(t)) {
			System.out.println("GRESKA");
		} else {
			System.out.println((13 - p.size()) + " " + (13 - k.size()) + " " + (13 - h.size()) + " " + (13 - t.size()));
		}
	}

	public static boolean checkDuplicate(ArrayList arrList) {
		HashSet set = new HashSet();
		for (int i = 0; i < arrList.size(); i++) {
			boolean test = set.add(arrList.get(i));
			if (test == false) {
				return test;
			}
		}
		return true;
	}

}
