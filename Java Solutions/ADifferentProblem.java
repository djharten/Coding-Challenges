import java.util.Scanner;
public class ADifferentProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLong()) {
        long a = sc.nextLong();
        long b = sc.nextLong();
        long dif = Math.abs(a-b);
        System.out.println(dif);
        }
    }
}
