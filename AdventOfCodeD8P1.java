import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class AdventOfCodeD8P1 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new File("input.txt"));
		Scanner in = new Scanner(new File("input.txt"));

		String arr[][] = moveToArray(sc);

		int highestNum = 0;

		for (int i = 0; i < arr.length; i++) {

			String numString = arr[i][1];
			int num = Integer.parseInt(numString);

			String name = in.next();
			String action = in.next();
			int val = in.nextInt();
			in.next();
			String nameTwo = in.next();
			String cond = in.next();
			int valTwo = in.nextInt();

			int numTwo = getNumTwoValue(nameTwo, arr);
			int finalNum = checkCondition(action, val, nameTwo, valTwo, num, numTwo, cond);

			for (int k = 0; k < i; k++) {
				String checkThruArray = arr[k][0];
				if (checkThruArray.equals(name)) {
					String addNum = arr[k][1];
					int addIntNum = Integer.parseInt(addNum);
					finalNum += addIntNum;
					break;
				}
			}

			numString = Integer.toString(finalNum);
			arr[i][1] = numString;

			for (int j = 0; j < i; j++) {
				String updateThruArray = arr[j][0];
				if (updateThruArray.equals(name)) {
					arr[j][1] = numString;
				}
			}
		}
		findAndPrintResult(arr);
	}

	public static String[][] moveToArray(Scanner input) {

		String arr[][] = new String[1000][2];

		for (int i = 0; i < 1000; i++) {
			for (int j = 0; j < 1; j++) {
				arr[i][j] = input.next();
				arr[i][j + 1] = "0";
			}
			input.nextLine();
		}

		return arr;

	}

	public static int getNumTwoValue(String nameTwo, String array[][]) {

		int count = 0;
		String checkName = array[count][0];

		while (!checkName.equals(nameTwo)) {
			count++;
			checkName = array[count][0];
		}

		String numStringTwo = array[count][1];
		int numTwo = Integer.parseInt(numStringTwo);

		return numTwo;

	}

	public static int checkCondition(String action, int val, String nameTwo, int valTwo, int num, int numTwo,
			String cond) {

		switch (cond) {

		case "!=":
			if (numTwo != valTwo) {
				num += checkConds(val, num, action);
				break;
			} else {
				break;
			}
		case "==":
			if (numTwo == valTwo) {
				num += checkConds(val, num, action);
				break;
			} else {
				break;
			}
		case ">":
			if (numTwo > valTwo) {
				num += checkConds(val, num, action);
				break;
			} else {
				break;
			}
		case "<":
			if (numTwo < valTwo) {
				num += checkConds(val, num, action);
				break;
			} else {
				break;
			}
		case ">=":
			if (numTwo >= valTwo) {
				num += checkConds(val, num, action);
				break;
			} else {
				break;
			}
		case "<=":
			if (numTwo <= valTwo) {
				num += checkConds(val, num, action);
				break;
			} else {
				break;
			}
		default:
			break;

		}
		return num;
	}

	public static void findAndPrintResult(String array[][]) {

		int finalNum = 0;
		int newArr[] = new int[array.length];

		for (int k = 0; k < array.length; k++) {
			String finalNumString = array[k][1];
			finalNum = Integer.parseInt(finalNumString);
			newArr[k] = finalNum;
		}

		Arrays.sort(newArr);
		System.out.println(newArr[newArr.length - 1]);
	}
  
	public static int checkConds(int val, int num, String action) {

		int returnNum = 0;

		if (action.equals("dec")) {
			returnNum = (val * -1);
		} else {
			returnNum = val;
		}
		return returnNum;
	}
}
