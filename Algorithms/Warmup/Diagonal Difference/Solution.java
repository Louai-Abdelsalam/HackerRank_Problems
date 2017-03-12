import java.io.*;
import java.util.*;
import java.lang.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int sum1 = 0, sum2 = 0;
        int k = (N - 1);
        int [][]arr = new int[N][N];

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                arr[i][j] = in.nextInt();

                if (i == j)
                {
                    sum1 += arr[i][j];
                }
                if (k == j)
                {
                    sum2 += arr[i][j];
                    k--;
                }

            }
        }

        System.out.printf("%d", Math.abs(sum1 - sum2));
    }
}
/*
[0][0] [0][1] [0][2]
[1][0] [1][1] [1][2]
[2][0] [2][1] [2][2]

Diagonal 1 = [0][0] + [1][1] + [2][2] => [i][i] and increment i WHILE i < N
Diagonal 2 = [0][2] + [1][1] + [2][0] => [i][j] i starts 0 and increments WHILE i < N && j starts (N - 1) and decrements WHILE    j >= 0
*/
