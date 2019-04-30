import java.util.ArrayList;

public class AdventOfCodeD15P2 {
	public static void main(String[] args) {
		long genA = 699L;
		long genB = 124L;
		int count = 0;

		ArrayList<String> firstArr = new ArrayList<String>();
		ArrayList<String> secondArr = new ArrayList<String>();

		while(true) {
			genA = (genA * 16807) % 2147483647;
			genB = (genB * 48271) % 2147483647;

			String binA = Long.toBinaryString(genA);
			String binB = Long.toBinaryString(genB);
			
			if (genA % 4 == 0) {
				firstArr.add(binA);
			}

			if (genB % 8 == 0) {
				secondArr.add(binB);
			}
			
			if(firstArr.size() >= 5000000 && secondArr.size() >= 5000000) {
				break;
			}
		}
		
		for(int k = 0; k < 5000000; k++) {
			String binA = firstArr.get(k);
			String binB = secondArr.get(k);
			
			if (binA.length() >= 16 && binB.length() >= 16) {
				binA = binA.substring(binA.length() - 16);
				binB = binB.substring(binB.length() - 16);
			}
			
			if(binA.equals(binB)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
