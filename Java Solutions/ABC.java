import java.util.Arrays;
import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        sc.nextLine();
        String letters = sc.nextLine();

        int orderedArr[] = new int[3];

        for (int k = 0; k < 3; k++) {
            if (letters.charAt(k) == 'A') {
                System.out.print(arr[0]);
            } else if (letters.charAt(k) == 'B') {
                System.out.print(arr[1]);
            } else {
                System.out.print(arr[2]);
            }
            System.out.print(" ");
        }
    }
}
