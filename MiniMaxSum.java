import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        long minSum = 0L;
        long maxSum = 0L;
        
        for(int i = 0; i < arr.length-1; i++) {
        	minSum += arr[i];
        	maxSum += arr[arr.length-1-i];
        }
        printSums(minSum,maxSum);
    }
    
    static void printSums(long minSum, long maxSum) {
    	System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
