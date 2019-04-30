import java.util.Scanner;

public class HangingOutOnTheTerrace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int safeNum = sc.nextInt();
		int tests = sc.nextInt();
		sc.nextLine();
		
		int curNum = 0;
		int fails = 0;
		
		while(tests != 0) {
			String action = sc.next();
			int guests = sc.nextInt();
			sc.nextLine();
			
			if(action.equals("enter")){
				curNum += guests;
				if(curNum > safeNum) {
					curNum -= guests;
					fails++;
				}
			} else {
				curNum -= guests;
			}
			tests--;
		}
		
		System.out.println(fails);

	}

}
