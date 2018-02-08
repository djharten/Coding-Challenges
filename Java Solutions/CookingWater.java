import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CookingWater {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		boolean edRight = false;

		ArrayList<Integer> beginTimes = new ArrayList<Integer>();
		ArrayList<Integer> endTimes = new ArrayList<Integer>();

		for (int i = 0; i < cases; i++) {
			beginTimes.add(sc.nextInt());
			endTimes.add(sc.nextInt());
		}
		
		Collections.sort(beginTimes);
		Collections.sort(endTimes);
		
		for(int j = 0; j < beginTimes.size(); j++) {
			if(beginTimes.get(beginTimes.size()-1) > endTimes.get(endTimes.size()-1-j)) {
				edRight = true;
				break;
			}
		}

		if (edRight) {
			System.out.println("edward is right");
		} else {
			System.out.println("gunilla has a point");
		}

	}

}
