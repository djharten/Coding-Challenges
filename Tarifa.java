import java.util.Scanner;

public class Tarifa {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int leftoverMB = 0;
        int spentMB;
        int remainingMB;
        int count = 0;
        
        int initialMB = sc.nextInt();
        
        int numberMonths = sc.nextInt();
        
            while(numberMonths != count){
            spentMB = sc.nextInt();
            remainingMB = initialMB - spentMB;
            leftoverMB = leftoverMB + remainingMB;
            count++;
            }
            

        int totalBalance = leftoverMB + initialMB;
        
        System.out.println(totalBalance);
        
    }

}

