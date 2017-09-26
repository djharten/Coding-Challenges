import java.util.Scanner;

public class SavingForRetirement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] inputList = input.split(" ");
		int bAge = Integer.parseInt(inputList[0]);
		int bRetire = Integer.parseInt(inputList[1]);
		int bSaved = Integer.parseInt(inputList[2]);
		int aAge = Integer.parseInt(inputList[3]);
		int aSaved = Integer.parseInt(inputList[4]);
		
		int totalSaved = (bRetire - bAge) * bSaved;
		int aAdded = 0;
		
		while(totalSaved >= aAdded) {
			aAdded = aAdded + aSaved;
			aAge++;
		}
		
		System.out.println(aAge);
	}

}
