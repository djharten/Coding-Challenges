import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class UnBearAbleZoo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numAnimals = sc.nextInt();
		
		int numCase = 1;
		
		while(numAnimals != 0) {
			
			sc.nextLine();
			
			String[] animals = new String[numAnimals];
			
			for(int i = 0; i < numAnimals; i++) {
				animals[i] = sc.nextLine();
			}
			
			ArrayList<String> animalList = new ArrayList<String>();
			
			for(int k = 0; k < numAnimals; k++) {
				String[] animal = animals[k].split(" ");
				String indWord = animal[animal.length-1].toLowerCase();
				animalList.add(indWord);
			}
			
			Collections.sort(animalList);
			
			int animalCount = 1;
			
			System.out.println("List " + numCase + ":");
			
			if(animalList.size() == 1) {
				System.out.println(animalList.get(0) + " | " + animalCount);
			}
			
			for(int j = 0; j < animalList.size()-1; j++) {
				if(animalList.get(j).equals(animalList.get(j+1))) {
					animalCount++;
					if(j == animalList.size()-2) {
						System.out.println(animalList.get(j) + " | " + animalCount);
						break;
					}
				} else {
					System.out.println(animalList.get(j) + " | " + animalCount);
					animalCount = 1;
					if(j == animalList.size()-2) {
						System.out.println(animalList.get(j+1) + " | " + animalCount);
						break;
					}
				}
			}
			
			numCase++;
			numAnimals = sc.nextInt();
			
		}
	}
}
