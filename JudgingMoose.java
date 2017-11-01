import java.util.Scanner;

public class JudgingMoose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tineLeft = sc.nextInt();
        int tineRight = sc.nextInt();
        int points = 0;
        
        if(tineLeft == 0 && tineRight == 0) {
            System.out.println("Not a moose");
        } else if(tineLeft > tineRight) {
            points = tineLeft * 2;
            System.out.println("Odd " + points);
        } else if(tineRight > tineLeft) {
            points = tineRight * 2;
            System.out.println("Odd " + points);
        } else {
            points = tineLeft * 2;
            System.out.println("Even " + points);
        }
    }

}
