import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class CandyDivision {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long numCandy = sc.nextLong();
		TreeSet<Long> numList = new TreeSet<>();
		
		for(long i = 2L; i <= Math.ceil(Math.sqrt(numCandy)); i++) {
			if(numCandy % i == 0) {
				numList.add(i);
				if(i != numCandy/i) {
					numList.add((numCandy/i));
				}
			}
		}
		
		
		System.out.print("0");
		
		Iterator<Long> printAns = numList.iterator();
		
		while(printAns.hasNext()) {
			System.out.print(" " + (printAns.next()-1));
		}
		
		System.out.println(" " + (numCandy-1));
	}
}
