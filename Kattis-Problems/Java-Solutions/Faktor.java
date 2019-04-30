import java.util.Scanner;

public class Faktor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int articles = sc.nextInt();
        int impact = sc.nextInt();
        
        System.out.println((articles * (impact - 1))+1);
    }
}
