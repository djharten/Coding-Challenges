import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class AdventOfCodeD6P1 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new File("nums.txt"));
		String input = sc.nextLine();
		input = input.replaceAll("\\s+", " ");
		Scanner inp = new Scanner(input);
		ArrayList<String> lists = new ArrayList<String>();
		lists.add(input);

		ArrayList<Integer> nums = new ArrayList<Integer>();

		while (inp.hasNext()) {
			nums.add(inp.nextInt());
		}

		boolean check = true;
		int count = 1;

		while (check) {

			int largest = 0;
			int index = 0;

			for (int i = 0; i < nums.size(); i++) {
				if (nums.get(i) > largest) {
					largest = nums.get(i);
					index = i;
				}
			}

			nums.set(index, 0);

			if (index == nums.size() - 1) {
				index = 0;
			} else {
				index++;
			}

			for (int k = 0; k < largest; k++) {
				if (index == nums.size() - 1) {
					nums.set(index, nums.get(index) + 1);
					index = 0;
				} else {
					nums.set(index, nums.get(index) + 1);
					index++;
				}
			}

			String newList = "";
			String sect = Integer.toString(nums.get(0));
			newList += sect;

			for (int j = 0; j < nums.size() - 1; j++) {
				newList += " " + sect;
				sect = Integer.toString(nums.get(j + 1));

			}

			lists.add(newList);

			int c = 0;

			for (int n = 0; n < lists.size(); n++) {
				if (lists.get(c).equals(lists.get(n)) && c != n) {
					check = false;
					break;
				} else if (c == lists.size() - 1 && n == lists.size() - 1) {
					count++;
					break;
				} else if (n == lists.size() - 1) {
					c++;
					n = -1;
				}

			}
			System.out.println(count);
		}
	}
}
