import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedInputStream;

public class Backspace {
	public static void main(String[] args) throws IOException {

		Kattio io = new Kattio(new BufferedInputStream(System.in));
		String input = io.getWord();
		
		StringBuilder word = new StringBuilder();

		for(int i = 0; i < input.length(); i++) {
			char let = input.charAt(i);
			if(let == '<') {
				if(word.length() > 0) {
					word.deleteCharAt(word.length()-1);
				}
			} else {
				word.append(let);
			}
		}
		
		System.out.println(word);
		io.close();
	}
}