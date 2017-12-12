import java.util.Scanner;

public class TheOwlAndTheFox {
	public static void main(String[] args) {
		
		Kattio io = new Kattio(System.in);

		int cases = io.getInt();
		int sum = 0;

		for (int i = 0; i < cases; i++) {

			int num = io.getInt();
			int newNum = num - 1;
			int newSum = 0;

			while (num > 0) {
				
				int modNum = num % 10;
				sum += modNum;
				num /= 10;
				
			}

			do {

				newSum = 0;
				int testNewNum = newNum;

				while (testNewNum > 0) {

					int newModNum = testNewNum % 10;
					newSum += newModNum;
					testNewNum /= 10;
					
				}

				newNum--;

			} while (newSum != sum - 1);

			System.out.println(newNum + 1);
			
			sum = 0;
		}
	}
}
