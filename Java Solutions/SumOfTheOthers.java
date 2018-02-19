import java.util.Scanner;

public class SumOfTheOthers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()) {
            String[] input = sc.nextLine().split(" ");
            int[] vals = new int[input.length];
            for(int i = 0; i < input.length; i++) {
                vals[i] = Integer.parseInt(input[i]);
            }
            
            int sum = 0;
            int count = 0;
            int numCounted = 0;
            
            for(int k = 0; k < vals.length; k++) {
                if(k != count) {
                    sum += vals[k];
                    numCounted++;
                }
                if(numCounted == vals.length-1) {
                    if(sum == vals[count]) {
                        break;
                    } else {
                        count++;
                        numCounted = 0;
                        k = -1;
                        sum = 0;
                    }
                }
                
            }
            System.out.println(vals[count]);
        }
    }
}

