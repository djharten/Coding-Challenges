import java.util.Arrays;
import java.util.Scanner;

public class Akcija {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int books = sc.nextInt();
        int[] prices = new int[books];
        for(int i = 0; i < books; i++) {
            prices[i] = sc.nextInt();
        }
        Arrays.sort(prices);
        int sum = 0;
        for(int i = prices.length-1; i >= 0; i--) {
            if(i >= 2) {
                sum += prices[i] + prices[i-1];
                i -= 2;
            } else if(i == 1){
                sum += prices[i] + prices[i-1];
                i = 0;
            } else {
                sum += prices[i];
            }
        }
        System.out.println(sum);
    }

}
