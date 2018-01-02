import java.util.Scanner;

public class Preludes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 1;
		
		while(sc.hasNext()) {
			String note = sc.nextLine();
			String splitNote[] = note.split(" ");
			String newNote = "";
			
			if(splitNote[0].equals("Ab")) {
				newNote = "G# " + splitNote[1];
			} else if(splitNote[0].equals("G#")) {
				newNote = "Ab " + splitNote[1];
			} else if(splitNote[0].equals("Gb")) {
				newNote = "F# " + splitNote[1];
			} else if(splitNote[0].equals("F#")) {
				newNote = "Gb " + splitNote[1];
			} else if(splitNote[0].equals("Eb")) {
				newNote = "D# " + splitNote[1];
			} else if(splitNote[0].equals("D#")) {
				newNote = "Eb " + splitNote[1];
			} else if(splitNote[0].equals("Db")) {
				newNote = "C# " + splitNote[1];
			} else if(splitNote[0].equals("C#")) {
				newNote = "Db " + splitNote[1];
			} else if(splitNote[0].equals("Bb")) {
				newNote = "A# " + splitNote[1];
			} else if(splitNote[0].equals("A#")) {
				newNote = "Bb " + splitNote[1];
			} else {
				newNote = "UNIQUE";
			}
			
			System.out.println("Case " + count + ": " + newNote);
			count++;
		}

	}

}
