import java.util.Scanner;

public class Spavanac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String oldTime = sc.nextLine();
		
		String[] inputList = oldTime.split(" ");
		int hour = Integer.parseInt(inputList[0]);
		int minute = Integer.parseInt(inputList[1]);
		
		if(minute - 45 > 0) {
			int newMinute = (int) minute - 45;
			System.out.println(hour + " " + newMinute);
		} else {
			if(hour - 1 >= 0) {
				hour = hour - 1;
				int newMinuteTwo = 60 - ((minute - 45)*-1);
				System.out.println(hour + " " + newMinuteTwo);
			} else {
					hour = 23;
					int newMinuteTwo = 60 - ((minute - 45)*-1);
					System.out.println(hour + " " + newMinuteTwo);
			}
			
			}
		}
	}

