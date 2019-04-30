import java.util.Arrays;
import java.util.Scanner;

public class ColoringSocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numSocks = sc.nextInt();
        int macCap = sc.nextInt();
        int cDiff = sc.nextInt();
        int[] socks = new int[numSocks];

        for (int i = 0; i < numSocks; i++) {
            socks[i] = sc.nextInt();
        }

        Arrays.sort(socks);

        int numWashers = 0;
        int sockLoc = 0;

        for (int j = 0; j < numSocks; j++) {

            if (j == numSocks - 1) {
                numWashers++;
                break;
            }

            if (socks[j + 1] - socks[sockLoc] > cDiff) {
                numWashers++;
                sockLoc = j + 1;
            } else if (j - sockLoc == macCap - 1) {
                numWashers++;
                sockLoc = j + 1;
            }
        }

        System.out.println(numWashers);

    }
}
