import java.util.ArrayList;
import java.util.Scanner;

public class GreedilyIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        ArrayList<Integer> seqNums = new ArrayList<Integer>();
        
        for(int i = 0; i < nums; i++) {
            seqNums.add(sc.nextInt());
        }
        
        ArrayList<Integer> newNums = new ArrayList<Integer>();
        newNums.add(seqNums.get(0));
        
        for(int j = 1; j < seqNums.size(); j++) {
            if(seqNums.get(j) > newNums.get(newNums.size()-1)) {
                newNums.add(seqNums.get(j));
            }
        }
        
        System.out.println(newNums.size());
        System.out.print(newNums.get(0));
        
        for(int k = 1; k < newNums.size(); k++) {
            System.out.print(" " + newNums.get(k));
        }
    }
}