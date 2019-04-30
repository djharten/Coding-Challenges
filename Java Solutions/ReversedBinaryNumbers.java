import java.util.Scanner;

public class ReversedBinaryNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        String binary = Integer.toBinaryString(input);
        String reverse = new StringBuilder(binary).reverse().toString();
        int newInt = Integer.parseInt(reverse, 2);
        
        System.out.println(newInt);
    }
}

