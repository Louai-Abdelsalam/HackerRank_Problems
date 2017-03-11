import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int N = in.nextInt();
        int []arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
            sum += arr[i];
        }

        System.out.printf("%d", sum);
    }
}
