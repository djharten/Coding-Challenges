import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades){
        for(int i = 0; i < grades.length; i++) {
        	int num = grades[i] % 10;
        	if(grades[i] < 38) {
        		continue;
        	} else if(num >= 3 && num < 5) {
        		grades[i] = ((grades[i]/10)*10)+5;
        	} else if(num == 8 || num == 9) {
        		grades[i] = ((grades[i]/10)*10)+10;
        	}
        }
        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}
