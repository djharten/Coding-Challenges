import java.util.Arrays;
import java.util.Scanner;
public class PigLatin {

    public static void main(String[] args) {
        
          Scanner sc = new Scanner(System.in); 
               while(sc.hasNext()){
                  convertWord(sc.nextLine());
              }
         
    }

    public static boolean isVowel(char c) {
        return "aeiouyAEIOUY".indexOf(c) != -1;
    }

    public static void convertWord(String words) {
    	
        String[] splitWord = words.split(" ");
        String finalWord = null;
        String remainingWord;
        int counter = 0;
        String completeWord[] = new String[splitWord.length];

        for (int i = 0; i < splitWord.length; i++) {
            char letter = splitWord[i].charAt(0);
            if (isVowel(letter)) {
                finalWord = splitWord[i] + "yay";
                counter++;
                completeWord[i] = finalWord;
            } else {
                while (!isVowel(letter)) {
                    String firstPartWord = splitWord[i].substring(0, counter + 1);
                    remainingWord = splitWord[i].substring(counter + 1);
                    finalWord = remainingWord + firstPartWord + "ay";
                    counter++;
                    letter = splitWord[i].charAt(counter);
                }
            }
            counter = 0;
        }
        System.out.println(finalWord);
    }
}