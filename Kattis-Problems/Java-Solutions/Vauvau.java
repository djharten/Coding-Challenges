import java.util.Scanner;

public class Vauvau {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dogFirstAgg = sc.nextInt();
		int dogFirstCalm = sc.nextInt();
		int dogSecondAgg = sc.nextInt();
		int dogSecondCalm = sc.nextInt();
		
		int workerArr[] = new int[3];
		workerArr[0] = sc.nextInt();
		workerArr[1] = sc.nextInt();
		workerArr[2] = sc.nextInt();
		
		boolean dogOneAgg = true;
		boolean dogTwoAgg = true;
		
		for(int i = 0; i < workerArr.length; i++) {
			int remainTimeOne = workerArr[i] % (dogFirstAgg + dogFirstCalm);
			int remainTimeTwo = workerArr[i] % (dogSecondAgg + dogSecondCalm);
			
			if(remainTimeOne <= dogFirstAgg && remainTimeOne != 0) {
				dogOneAgg = true;
			} else {
				dogOneAgg = false;
			}
			
			if(remainTimeTwo <= dogSecondAgg && remainTimeTwo != 0) {
				dogTwoAgg = true;
			} else {
				dogTwoAgg = false;
			}
			
			if(dogOneAgg && dogTwoAgg) {
				System.out.println("both");
			} else if (!dogOneAgg && !dogTwoAgg) {
				System.out.println("none");
			} else {
				System.out.println("one");
			}
		}

	}

}
