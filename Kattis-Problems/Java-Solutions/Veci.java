import java.util.Arrays;
import java.util.Scanner;

public class Veci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String numLet = Integer.toString(num);
		char indNums[] = numLet.toCharArray();
		Arrays.sort(indNums);
		boolean checkEqual = true;
		
		for(int i = num+1; i <= 999999; i++) {
			
			String numLetTwo = Integer.toString(i);
			char indNumsTwo[] = numLetTwo.toCharArray();
			Arrays.sort(indNumsTwo);
			
			checkEqual = Arrays.equals(indNums, indNumsTwo);
			
			if(checkEqual) {
				System.out.println(i);
				break;
			}
		}
		
		if(!checkEqual || num == 999999) {
			System.out.println("0");
		}

	}

}
