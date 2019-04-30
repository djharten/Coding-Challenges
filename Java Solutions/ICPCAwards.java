import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ICPCAwards {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numTeams = sc.nextInt();
		sc.nextLine();
		ArrayList<String> winTeams = new ArrayList<String>();
		ArrayList<String> teamList = new ArrayList<String>();
		
		for (int i = 0; i < numTeams; i++) {
			winTeams.add(sc.nextLine());
			String nameSchool[] = winTeams.get(i).split(" ");
			teamList.add(nameSchool[0]);
		}
		
		int count = 0;
		
		for(int k = 0; k < numTeams; k++) {
			
			if(teamList.get(count).equals(teamList.get(k)) && count != k){
				winTeams.remove(k);
				teamList.remove(k);
				numTeams--;
				k--;
			}
			
			if(k == numTeams-1 && count != numTeams-1) {
				k = count;
				count++;
			}
		}
		
		for(int j = 0; j < 12; j++) {
			System.out.println(winTeams.get(j));
		}

	}
}