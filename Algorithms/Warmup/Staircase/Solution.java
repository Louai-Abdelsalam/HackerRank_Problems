import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0, count = (n - 1); i < n; i++, count--)
        {
            for (int j = 0; j < n; j++)
            {
                if (j < count)
                {
                    System.out.printf(" ");
                }
                else
                {
                    System.out.printf("#");
                }
            }

            if (i != (n - 1))
            {
                System.out.println();
            }
        }
    }
}
