import java.util.Scanner;

public class Crne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = a/2;
        long c = b;
        
        if(b+c < a) {
            b++;
        }
        
        long ans = (b+1) * (c+1);
        System.out.println(ans);
        
    }
}
