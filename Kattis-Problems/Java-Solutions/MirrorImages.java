import java.util.Scanner;

public class MirrorImages {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		int count = 1;
		
		for(int i = 0; i < cases; i++) {
			
			int row = sc.nextInt();
			int col = sc.nextInt();
			sc.nextLine();

			char[][] mirror = new char[row][col];
			
			for(int k = 0; k < row; k++) {
				
				String data = sc.nextLine();
				
				for(int j = 0; j < col; j++) {
						mirror[row-k-1][col-j-1] = data.charAt(j);
				}
			}
			
			System.out.println("Test " + count);
			
			for(int n = 0; n < row; n++) {
				for(int q = 0; q < col; q++) {
					System.out.print(mirror[n][q]);
				}
				System.out.println();
			}
			count++;	
		}
	}
}