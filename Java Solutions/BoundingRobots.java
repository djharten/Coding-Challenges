import java.util.Scanner;

public class BoundingRobots {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int wid = sc.nextInt();
		int len = sc.nextInt();

		int wLocReal = 0;
		int lLocReal = 0;
		int wLocRobot = 0;
		int lLocRobot = 0;

		while (wid != 0 && len != 0) {

			int numSeg = sc.nextInt();
			sc.nextLine();

			for (int i = 0; i < numSeg; i++) {
				
				char letter = sc.next().charAt(0);
				int move = sc.nextInt();
				
				if (letter == 'u') {
					lLocRobot += move;
					lLocReal += move;
				} else if (letter == 'd') {
					lLocRobot -= move;
					lLocReal -= move;
				} else if (letter == 'r') {
					wLocRobot += move;
					wLocReal += move;
				} else {
					wLocRobot -= move;
					wLocReal -= move;
				}
				
				if (lLocReal >= len) {
					lLocReal = len - 1;
				}
				if (wLocReal >= wid) {
					wLocReal = wid - 1;
				}
				
				if(lLocReal <= 0) {
					lLocReal = 0;
				}
				if(wLocReal <= 0) {
					wLocReal = 0;
				}
				
			}

			System.out.println("Robot thinks " + wLocRobot + " " + lLocRobot);
			System.out.println("Actually at " + wLocReal + " " + lLocReal);

			lLocRobot = 0;
			wLocRobot = 0;
			lLocReal = 0;
			wLocReal = 0;

			wid = sc.nextInt();
			len = sc.nextInt();

		}
	}
}
