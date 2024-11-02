/*

DATE: 02/11/2024

  QUESTION:


Writing Speed
Rahul has a 5-page assignment due in 60 minutes. He can write one page in X minutes.

Determine if Rahul can complete the assignment within the given time constraint.

Input Format
The only line of input will contain a single integer X, denoting the time taken (in minutes) by Rahul to write one page.
Output Format
Print YES if Rahul can complete the assignment in time, otherwise print NO.

You may print each character of the output in either uppercase or lowercase (for example, the strings YES, yEs, yes, and yeS will all be treated as identical).



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
		int x = s.nextInt();
		if(5*x <= 60){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}

	}
}
