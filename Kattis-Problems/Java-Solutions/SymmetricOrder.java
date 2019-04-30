import java.util.Arrays;
import java.util.Scanner;

public class SymmetricOrder {
	
	public static int counter = 1;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numNames = sc.nextInt();
		sc.nextLine();
		while(numNames != 0) {
		printNames(makeNamesSymmetric(getNames(numNames,sc)));
		numNames = sc.nextInt();
		sc.nextLine();
		}
	}
	
	public static String[] getNames(int numOfNames, Scanner input) {
		String arrNames[] = new String[numOfNames];
		
		for(int i = 0; i < arrNames.length; i++) {
			arrNames[i] = input.nextLine();
		}
		
		return arrNames;
	}

	public static String[] makeNamesSymmetric(String listOfNames[]) {
		
		String orderedNames[] = new String[listOfNames.length];
		
		int counter = 0;
		
		for(int k = 0; k < orderedNames.length/2; k++) {
			orderedNames[k] = listOfNames[k+counter]; 
			orderedNames[orderedNames.length-1-k] = listOfNames[k+1+counter];
			counter++;
		}
		
		if(orderedNames.length % 2 != 0) {
			orderedNames[orderedNames.length/2] = listOfNames[orderedNames.length-1];
		}
		
		return orderedNames;
		
	}
	
	public static void printNames(String finalList[]) {
		
		System.out.println("SET " + counter);
		counter++;
		
		for(int j = 0; j < finalList.length; j++) {
			System.out.println(finalList[j]);
		}
	}
}
