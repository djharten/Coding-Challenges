import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
        int sum = 1;
        int maxSum = 1;
        int mostCommon = ar[0];
        Arrays.sort(ar);
        for(int i = 1; i < ar.length-1; i++) {
        	if(ar[i] == ar[i+1]) {
        		sum++;
            	if(sum > maxSum) {
            		maxSum = sum;
            		mostCommon = ar[i];
            	}
        	} else {
        		sum = 1;
        	}	
        }
        return mostCommon;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
