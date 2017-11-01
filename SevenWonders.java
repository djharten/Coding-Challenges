import java.util.Scanner;

public class SevenWonders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        int tCard = 0;
        int cCard = 0;
        int gCard = 0;
        int total = 0;
        int counter = 1;
        
        for(int i = 0; i < input.length(); i++) {
            
            char t = 'T';
            char g = 'G';
            char c = 'C';
            
            if(input.charAt(i) == t){
                tCard++;
            } else if(input.charAt(i) == g){
                gCard++;
            } else if(input.charAt(i) == c) {
                cCard++;
            }

            if(tCard >= counter && gCard >= counter && cCard >= counter) {
                total += 7;
                counter++;
            }
        }
    
        total += (int) (Math.pow(tCard,2) + Math.pow(gCard,2) + Math.pow(cCard, 2));
        
        System.out.println(total);
        
    }

}
