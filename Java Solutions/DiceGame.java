import java.util.Scanner;

public class DiceGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sumGunnar = diceAndSum(sc);
		int sumEmma = diceAndSum(sc);
		determineWinner(sumGunnar, sumEmma);
	}
	
	public static int diceAndSum(Scanner input) {
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		
		int sum = a+b+c+d;
		return sum;
	}
	
	public static void determineWinner(int gunnar, int emma) {
		if(gunnar > emma) {
			System.out.println("Gunnar");
		} else if(emma > gunnar) {
			System.out.println("Emma");
		} else {
			System.out.println("Tie");
		}
	}

}
