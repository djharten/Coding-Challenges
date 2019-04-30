import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PhoneList {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		
		for(int i = 0; i < cases; i++) {
			ArrayList<String> nums = inputNumbers(sc);
			compareNumbers(nums);
		}
		
	}
	
	public static ArrayList<String> inputNumbers(Scanner input){
		
		ArrayList<String> numList = new ArrayList<String>();
		int numbers = input.nextInt();
		
		for(int k = 0; k < numbers; k++) {
			numList.add(input.next());
		}
		
		Collections.sort(numList);
		return(numList);
		
	}

	public static void compareNumbers(ArrayList<String> numbers) {

		String ans = "YES";
		
		for(int j = 0; j < numbers.size()-1; j++) {
			
			String compareEntire = numbers.get(j);
			String compareContains = numbers.get(j+1);
			
			if(compareContains.length() >= compareEntire.length()) {
				compareContains = compareContains.substring(0,compareEntire.length());
			}
			
			if(compareEntire.equals(compareContains)){
				ans = "NO";
			}
			
		}
		
		System.out.println(ans);
	
	}
}
