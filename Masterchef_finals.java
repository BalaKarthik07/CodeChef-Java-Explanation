/*

DATE: 31/10/2024

  QUESTION:

Masterchef finals
Chef has been working hard to compete in MasterChef.
He is ranked X out of all contestants. However, only 10 contestants would be selected for the finals.

Check whether Chef made it to the top 10 or not?

Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of one integers X — the current rank of Chef.
Output Format
For each test case, output on a new line, YES, if Chef made it to the top 10 and NO otherwise.

Each character of the output may be printed in either uppercase or lowercase. That is, the strings NO, no, nO, and No will be treated as equivalent.


  MY CODE:

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		while(T-->0)
		{
		    int X = s.nextInt();
		    if(X<=10)
		    {
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
