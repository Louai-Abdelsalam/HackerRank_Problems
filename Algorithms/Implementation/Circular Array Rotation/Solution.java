import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
/* algorithm1 [Timed Out]
    1, 2, 3
==> 3, 1, 2
saved1 = [1]            // [i + 1]
move [0] to [1]     // [i] to [i + 1]
---------------- loop i++
saved2 = [2]            // ""
move [1](saved1) to [2]     // ""
---------------- loop
move saved2 to [0]     // when ((i + 1) == n), move last saved number to [0]
*/
/*
        for (int i = 0; i < (k%n); i++)
        {
            for (int j = 0, saved1 = a[j], saved2; j < n; j++)
            {
                if ((j + 1) != n)
                {
                    if (j == 0)
                    {
                        saved1 = a[j + 1];
                        a[j + 1] = a[j];
                    }
                    else
                    {
                        saved2 = a[j + 1];
                        a[j + 1] = saved1;
                        saved1 = saved2;
                    }
                }
                else
                {
                    a[0] = saved1;
                }
            }
        }
*/
/*
0 1 2 3 4 5 6 k=3 n=7



4 5 6 0 1 2 3
*/

     for (int i = 0; i < n; i++)
     {
         if ((i - (k % n)) >= 0)
         {
            b[i] = a[i - (k % n)];
         }
         else
         {
             b[i] = a[n + (i - (k % n))]; //(7 + (0 -(3%7)))
         }

     }

     for (int i = 0; i < n; i++)
     {
         a[i] = b[i];
     }



/*  Algorithm3    [implemented]
0 1 2 3 4 5 k%n=3

0 1 2 0 4 5
saved = 3
-----------
3 1 2 0 4 5
after replacing 0 with 3, (if n % (k%n) == 0) move 1 index to the right then repeat. saved = 1
-----------
3 1 2 0 1 5
saved = 4
-----------
3 4 2 0 1 5
after replacing 1 with 4, (if n % (k%n) == 0) move 1 index to the right then repeat. saved = 2
-----------
3 4 2 0 1 2
saved = 5
-----------
3 4 5 0 1 2

3 4 5 0 1 2
loop condition (i < n)


0 1 2 3 4 k%n=3

0 1 2 0 4
saved = 3
-----------
0 3 2 0 4
saved = 1
-----------
0 3 2 0 1
saved = 4
-----------
0 3 4 0 1
saved = 2
-----------
2 3 4 0 1

2 3 4 0 1
loop condition (i < n)
*/
/*
        for (int i = 0, j = 0, saved1 = a[j], saved2; i < n ; i++)
        {
            //System.out.printf("loop entry test\n");
            if ((j + (k % n)) < n)
            {
                //System.out.printf("regular step\n");
                if (i == 0 && j == 0)
                {
                    saved1 = a[j + (k % n)];
                    a[j + (k % n)] = a[j];
                    j = j + (k % n);
                }
                else
                {
                    saved2 = a[j + (k % n)];
                    a[j + (k % n)] = saved1;
                    saved1 = saved2;
                    j = j + (k % n);
                }
            }
            else
            {
                if ((n % (k % n)) == 0)
                {
                    a[(j + (k % n)) - n] = saved1;
                    saved1 = a[(((j + (k % n)) - n) + 1)];
                    j = (((j + (k % n)) - n) + 1);
                }
                else
                {
                    saved2 = a[((j + (k % n)) - n)];
                    a[((j + (k % n)) - n)] = saved1;
                    saved1 = saved2;
                    j = ((j + (k % n)) - n);
                }
            }
        }
*/



/* Algorithm2 [doesn't add up (dropped)]
0 1 2 3 4 5 k%n=3

0 1 2 0 4 5
saved2 = 3
------
0 1 2 0 1 5
saved2 = 4
------
0 1 2 0 1 2
saved2 = 5
------
3 1 2 0 1 2
saved2 = 0
-------
3 4 2 0 1 2
saved2 = 1
-------
3 4 5 0 1 2
saved2 = 2

3 4 5 0 1 2

*/

        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            System.out.printf("%d", a[m]);

            if ((a0 + 1) < q)
            {
                System.out.println();
            }
        }
    }
}
