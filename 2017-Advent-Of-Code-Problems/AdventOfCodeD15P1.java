
public class AdventOfCodeD15P! {
	public static void main(String[] args) {
		long genA = 699L;
		long genB = 124L;
		int count = 0;
		
		for(int i = 0; i < 40000000; i++) {
			genA = (genA * 16807) % 2147483647;
			genB = (genB * 48271) % 2147483647;
			
			String binA = Long.toBinaryString(genA);
			String binB = Long.toBinaryString(genB);
			
			if(binA.length() >= 16 && binB.length() >= 16) {
			binA = binA.substring(binA.length()-16);
			binB = binB.substring(binB.length()-16);
			}
			
			if(binA.equals(binB)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
