import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        
    	Scanner sc = new Scanner(System.in);
    	int items = sc.nextInt();
    	int notEaten = sc.nextInt();
    	int cost = getCost(items,notEaten,sc);
    	int charged = sc.nextInt();
    	findDifference(cost,charged);
    }
    
    public static int getCost(int items, int notEaten, Scanner sc) {
    	int cost = 0;
    	for(int i = 0; i < items; i++) {
    		if(i != notEaten) {
    			cost += sc.nextInt();
    		} else {
    			sc.nextInt();
    		}
    	}
    	cost /= 2;
    	return cost;
    }
    
    public static void findDifference(int cost, int charged) {
    	if(charged == cost) {
    		System.out.println("Bon Appetit");
    	} else {
    		int delta = Math.abs(charged-cost);
    		System.out.println(delta);
    	}
    }
}
