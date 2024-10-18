/*

DATE: 18/10/2024

QUESTION:

Water Consumption

  Recently, Chef visited his doctor. The doctor advised Chef to drink at least 2000 ml of water each day.
  Chef drank X ml of water today. Determine if Chef followed the doctor's advice or not.

  Input Format
The first line contains a single integer T — the number of test cases. Then the test cases follow.
The first and only line of each test case contains one integer X — the amount of water Chef drank today.

  Output Format
For each test case, output YES if Chef followed the doctor's advice of drinking at least 2000 ml of water. Otherwise, output NO.
You may print each character of the string in uppercase or lowercase (for example, the strings YES, yEs, yes, and yeS will all be treated as identical).

  Sample 1:

    INPUT:                    OUTPUT:
      3                        YES
    2999                       NO
    1450                       YES
    2000                        

  Explanation:
Test case 1: Chef followed the doctor's advice since he drank 2999 ml of water which is ≥2000 ml.

Test case 2: Chef did not follow the doctor's advice since he drank 1450 ml of water which is <2000 ml.

Test case 3: Chef followed the doctor's advice since he drank 2000 ml of water which is ≥2000 ml.



  MY CODE:

*/



import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
    		int x = sc.nextInt();
    		// write your code here
    		if(x >= 2000)
    		    System.out.println("YES");
    		else
    		    System.out.println("NO");
		}
		
	}
}
