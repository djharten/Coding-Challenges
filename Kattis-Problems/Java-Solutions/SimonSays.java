import java.util.Arrays;
import java.util.Scanner;

public class SimonSays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int commands = sc.nextInt();
        sc.nextLine();
        
        for(int i = 1; i <= commands; i++) {
            String input = sc.nextLine();
            String[] inputArray = input.split(" ", 3);
            if(input.contains("Simon says")) {
                System.out.println(inputArray[2]);
            }
        }
    }
}
