import java.util.Scanner;

public class Herman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rad = sc.nextInt();
        System.out.println(Math.PI*(Math.pow(rad, 2)) + "\n" + Math.pow(rad, 2)*2);
    }
}

