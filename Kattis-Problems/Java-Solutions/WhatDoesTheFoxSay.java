import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WhatDoesTheFoxSay {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < cases; i++) {
			
			String[] soundArr = sc.nextLine().split(" ");
			ArrayList<String> allSounds = new ArrayList<String>();
			
			for(int j = 0; j < soundArr.length; j++) {
				allSounds.add(soundArr[j]);
			}
			
			String sound = sc.nextLine();
			
			while(!sound.equals("what does the fox say?")) {
				
				String[] indLine = sound.split(" ");
				int count = indLine.length-1;
				
				while(!indLine[count].equals("goes")) {
					for(int k = 0; k < allSounds.size(); k++) {
						if(allSounds.get(k).equals(indLine[count])) {
							allSounds.remove(indLine[count]);
							k--;
						}
					}
					count--;
				}
				sound = sc.nextLine();
			}
			
			for(int n = 0; n < allSounds.size()-1; n++) {
				System.out.print(allSounds.get(n) + " ");
			}
			
			System.out.print(allSounds.get(allSounds.size()-1));
			System.out.println();
		}

	}

}
