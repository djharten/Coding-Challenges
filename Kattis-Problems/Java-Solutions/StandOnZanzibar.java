import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StandOnZanzibar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		
		for(int i = 0; i < cases; i++) {
			ArrayList<Integer> population = new ArrayList<Integer>();
			
			while(sc.hasNextInt()) {
				population.add(sc.nextInt());
				
				if(population.get(population.size()-1).equals(0)){
					break;
				}
			}
			
			int maxAllowed = population.get(0);
			int notBorn = 0;
			
			for(int k = 1; k < population.size(); k++) {
				
				if(k == population.size()-1) {
					break;
				} else {
					
					maxAllowed = population.get(k-1)*2;
					
					if(population.get(k) > maxAllowed) {
						notBorn += (population.get(k) - maxAllowed);
					}
					
				}
				maxAllowed += population.get(k);
			}
			System.out.println(notBorn);
		}
	}
}
