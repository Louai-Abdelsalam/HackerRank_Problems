import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int posCount = 0, negCount = 0, number;
        float posFrac, negFrac, zeroFrac;

        for (int i = 0; i < N; i++)
        {
            number = in.nextInt();

            if (number > 0)
            {
                posCount++;
            }
            else if (number < 0)
            {
                negCount++;
            }
        }

        posFrac = ((float)posCount / N);
        negFrac = ((float)negCount / N);
        zeroFrac = ((float)(N - (posCount + negCount)) / N);
        System.out.printf("%f\n%f\n%f", posFrac, negFrac, zeroFrac);
    }
}
