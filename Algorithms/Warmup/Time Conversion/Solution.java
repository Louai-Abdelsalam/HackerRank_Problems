import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String time = in.nextLine();
        int hr = Integer.parseInt(time.substring(0, 2));
        //System.out.printf("the hr string is %s\n", hr);;

        if (time.charAt(time.length() - 2) == 'P')
        {
            //System.out.printf("retrieved char is %c\n", time.charAt(time.length() - 2));
            if (hr != 12)
            {
                hr += 12;
                time = Integer.toString(hr) + time.substring(2, (time.length() - 2));
            }
            else
            {
                time = time.substring(0, (time.length() - 2));
            }
        }
        else if ((time.charAt(time.length() - 2) == 'A') && (hr == 12))
        {
            time = "0" + "0" + time.substring(2, (time.length() - 2));
        }
        else
        {
            time = time.substring(0, (time.length() - 2));
        }

        System.out.printf("%s", time);
    }
}
/*
11AM = 12
12PM = 12
1PM = 13
2PM = 14
...
11PM = 23
12AM = 00
1AM = 1
2AM = 2
...

01AM -> 11AM, 12PM = same

01PM -> 11PM = (hr += 12)
12AM = 0
*/
