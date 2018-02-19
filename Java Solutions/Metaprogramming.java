import java.util.ArrayList;
import java.util.Scanner;

public class Metaprogramming {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> value = new ArrayList<Integer>();
        ArrayList<String> name = new ArrayList<String>();

        while (sc.hasNext()) {
            String[] input = sc.nextLine().split(" ");
            if (input[0].equals("define")) {
                value.add(Integer.parseInt(input[1]));
                name.add(input[2]);
            } else {
                String name1 = input[1];
                String name2 = input[3];
                boolean found1 = false;
                boolean found2 = false;
                char eval = input[2].charAt(0);
                int num1 = 0;
                int num2 = 0;
                for (int i = 0; i < name.size(); i++) {
                    if (name.get(i).equals(name1)) {
                        num1 = value.get(i);
                        found1 = true;
                    }
                    if (name.get(i).equals(name2)) {
                        num2 = value.get(i);
                        found2 = true;
                    }
                }
                if (found1 && found2) {
                    System.out.println(evaluate(num1, num2, eval));
                } else {
                    System.out.println("undefined");
                }
            }

        }

    }

    public static boolean evaluate(int num1, int num2, char eval) {
        if (eval == '<') {
            return num1 < num2;
        } else if (eval == '>') {
            return num1 > num2;
        } else {
            return num1 == num2;
        }
    }

}
