import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] inputList = input.split(" ");
		int fizzDivisible = Integer.parseInt(inputList[0]);
		int buzzDivisible = Integer.parseInt(inputList[1]);
		int amount = Integer.parseInt(inputList[2]);
		
		for(int i = 1; i <= amount; i++) {
			if(i % fizzDivisible == 0 && i % buzzDivisible == 0) {
				System.out.println("FizzBuzz");
			} else if(i % fizzDivisible == 0) {
				System.out.println("Fizz");;
			} else if(i % buzzDivisible == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}

}
