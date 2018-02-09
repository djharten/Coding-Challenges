import java.util.Random;
import java.util.Scanner;

public class BookingARoom {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int totalRooms = sc.nextInt();
		int totalBooked = sc.nextInt();
		int[] bookedRooms = new int[totalBooked];
		
		for(int i = 0; i < totalBooked; i++) {
			bookedRooms[i] = sc.nextInt();
		}
		
		if(totalRooms == totalBooked) {
			System.out.println("too late");
		} else {
			Random rand = new Random();
			int myNum = totalRooms;
			for(int j = 0; j < totalBooked; j++) {
				if(myNum == bookedRooms[j]) {
					myNum--;
					j = -1;
				}
			}
			System.out.println(myNum);
		}

	}

}
