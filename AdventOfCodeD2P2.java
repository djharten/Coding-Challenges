import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class AdventOfCodeD2P2 {
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File("numbers.txt"));

		int sum = 0;

		while (sc.hasNextLine()) {

			String list = sc.nextLine();
			Scanner input = new Scanner(list);

			ArrayList<Integer> numList = new ArrayList<Integer>();
			
			while (input.hasNext()) {
				numList.add(input.nextInt());
			}
			
			int count = 0;
			
			for(int i = 0; i < numList.size(); i++) {

				if(numList.get(count) % numList.get(i) == 0 && numList.get(count) != numList.get(i)) {
					sum += (numList.get(count) / numList.get(i));
					break;
				}
				
				if(i == numList.size()-1) {
					i = -1;
					count++;
				}
			}
		}
		System.out.println(sum);
	}
}
