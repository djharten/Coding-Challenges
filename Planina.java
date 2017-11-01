import java.util.Scanner;

public class Panina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int answer = (int) Math.pow((Math.pow(2, input) + 1), 2);
        System.out.println(answer);
    }
}
