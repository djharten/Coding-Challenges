import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] breakingRecords(int[] score) {
        int highest = score[0];
        int lowest = score[0];
        int highCount = 0;
        int lowCount = 0;
        for(int i = 1; i < score.length; i++) {
        	if(score[i] > highest) {
        		highCount++;
        		highest = score[i];
        	} else if(score[i] < lowest) {
        		lowCount++;
        		lowest = score[i];
        	}
        }
        int[] record = new int[2];
        record[0] = highCount;
        record[1] = lowCount;
        return record;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i = 0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        int[] result = breakingRecords(score);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
