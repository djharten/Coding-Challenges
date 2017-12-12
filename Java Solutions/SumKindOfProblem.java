import java.util.Scanner;

public class SumKindOfProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while (cases != 0) {
			int caseNumber = sc.nextInt();
			int checkInt = sc.nextInt();
			System.out.println(caseNumber + " " + calculatePosInts(checkInt) + " " + calculateOddInts(checkInt) + " "
					+ calculateEvenInts(checkInt));
			cases--;
		}

	}

	public static int calculatePosInts(int posInts) {
		int sum = 0;

		while (posInts > 0) {
			sum += posInts;
			posInts--;
		}
		return sum;
	}

	public static int calculateOddInts(int oddInts) {
		int sum = 0;
		int count = oddInts;
		oddInts = 1;

		while (count > 0) {
			sum += oddInts;
			oddInts += 2;
			count--;
		}
		return sum;
	}

	public static int calculateEvenInts(int evenInts) {
		int sum = 0;
		int count = evenInts;
		evenInts = 2;

		while (count > 0) {
			sum += evenInts;
			evenInts += 2;
			count--;
		}
		return sum;
	}
}
