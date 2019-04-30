import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CompoundWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> input = new ArrayList<String>();
		ArrayList<String> finalList = new ArrayList<String>();
		String compWord = "";

		while (sc.hasNext()) {
			input.add(sc.next());
		}

		int count = 0;

		for (int i = 0; i < input.size(); i++) {

			if (count != i) {
				compWord = input.get(count) + input.get(i);
			}
			
			if(!finalList.contains(compWord) && !compWord.equals("")) {
				finalList.add(compWord);
			}
			
			if(i == input.size()-1 && count != input.size()-1) {
				i = -1;
				count++;
			}
		}
		

		finalList.sort(String::compareToIgnoreCase);
		
		for(int k = 0; k < finalList.size(); k++) {
			String finalWord = finalList.get(k);
			System.out.println(finalWord);
		}

	}
}