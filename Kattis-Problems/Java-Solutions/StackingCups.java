import java.util.Arrays;
import java.util.Scanner;

public class StackingCups {
    
    public static class Pair implements Comparable<Pair> {
        public String color;
        public int size;
        @Override
        public int compareTo(Pair o) {
            return size - o.size;
        }
    }
    
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        int numCups = take.nextInt();
        
        Pair[] cups = new Pair[numCups];
        
        for (int i = 0; i < numCups; i++) {
            
            cups[i] = new Pair();

            if (take.hasNextInt()) {
                cups[i].size = take.nextInt();
                cups[i].color  = take.next();
            } else {
                cups[i].color = take.next();
                cups[i].size = take.nextInt() * 2;
            }
        }
        
        // Arrays.sort(cups, (a, b) -> a.size - b.size);
        Arrays.sort(cups);

        for (Pair cup : cups) {
            System.out.println(cup.color);
        }
        
        take.close();
    }

}
