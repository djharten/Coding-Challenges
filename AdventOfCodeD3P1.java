// http://adventofcode.com/2017/day/3

public class AdventOfCodeD3P1 {

	public static void main(String[] args) {
		
		int myVal = 265149;
		int num = 1;
		int square = 1;
		int count = 0;
		
		while(square < myVal) {
			square = num;
			square *= square;
			num += 2;
			count++;
		}
		
		int remainder = square - myVal;
		
		count = 3;
		
		while(remainder > 0) {
			remainder -= (num-1);
			count++;
		}
		
		if(remainder < 0) {
			remainder += (num-1);
			count--;
		}
		
		int mid = num/2;
		
		if(num % 2 == 1) {
			mid += 1;
		}
		
		int moves = Math.abs(mid-remainder)+(mid-1) - count;

		System.out.println(moves);

	}

}
