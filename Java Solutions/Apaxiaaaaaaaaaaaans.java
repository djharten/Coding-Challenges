import java.util.Scanner;

public class Apaxiaaaaaaaaaaaans {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		String longName = sc.nextLine();

		if (longName.isEmpty()) {
			return;
		}

		StringBuilder sb = new StringBuilder();
		sb.append(longName.charAt(0));

		for (int i = 1; i < longName.length(); i++) {
			if (longName.charAt(i - 1) == longName.charAt(i))
				continue;
				sb.append(longName.charAt(i));
			}
		System.out.println(sb);
		}

	}
