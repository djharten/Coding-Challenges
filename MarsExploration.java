import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int marsExploration(String s) {
        int count = 1;
        int wrongMessage = 0;
        for(int i = 0; i < s.length(); i++){
            char let = s.charAt(i);
            if((let != 'S' && count == 1) || (let != 'S' && count == 3) || (let != 'O' && count == 2)){
                wrongMessage++;
                count++;
                if(count == 4) {
                	count = 1;
                }
            } else{
                count++;
                if(count == 4){
                    count = 1;
                }
            }
        }
        return wrongMessage;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = marsExploration(s);
        System.out.println(result);
        in.close();
    }
}
