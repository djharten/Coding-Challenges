import java.util.Scanner;

public class ARealChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area = sc.nextDouble();
        
        double length = Math.sqrt(area)*4;
        
        System.out.println(length);
    }

}
