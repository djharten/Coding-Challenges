
public class LargestCollatzSequence {
	public static void main(String[] args) {
	
		long testNum = 0;
		int count = 1;
		int finalCount = 0;
		long numAns = 0;

		for (long i = 999999; i > 0; i--) {
			
			testNum = i;
			
			while (i != 1) {
				if (i % 2 == 0) {
					i /= 2;
				} else {
					i = (3*i) + 1;
				}
				count++;
			}
			
			if(count > finalCount) {
				finalCount = count;
				numAns = testNum;
			}
			
			count = 1;
			i = testNum;
			
		}
		System.out.println(numAns);
	}
}
