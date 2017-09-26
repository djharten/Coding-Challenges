import java.util.Scanner;

public class Bijele {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] inputList = input.split(" ");
		int king = Integer.parseInt(inputList[0]);
		int queen = Integer.parseInt(inputList[1]);
		int rook = Integer.parseInt(inputList[2]);
		int bishop = Integer.parseInt(inputList[3]);
		int knight = Integer.parseInt(inputList[4]);
		int pawn = Integer.parseInt(inputList[5]);
		
		int kingNeed = 1 - king;
		int queenNeed = 1 - queen;
		int rookNeed = 2 - rook;
		int bishopNeed= 2 - bishop;
		int knightNeed = 2 - knight;
		int pawnNeed = 8 - pawn;
		
		System.out.println(kingNeed + " " + queenNeed + " " + rookNeed + " " + bishopNeed + " " + knightNeed + " " + pawnNeed);
	}

}
