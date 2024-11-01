/*

DATE: 01/11/2024


QUESTION:



International Justice Day
In honor of International Justice Day, the Supreme Court of Chefland has decided to address all pending cases simultaneously.

For a given case, the accused will be convicted if the convincing power of the prosecution, denoted by integer X, is greater than or equal to the convincing power of the defense, denoted by integer Y.

Determine whether the accused is convicted.

Input Format
The only line of input consists of space-separated integers X and Y, denoting the convincing powers of prosecution and defense, respectively.
Output Format
Output on a new line, YES, if the accused is convicted and NO otherwise.

You may print each character of the string in uppercase or lowercase (for example, the strings YES, yEs, yes, and yeS will all be treated as identical).



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
		int y = s.nextInt();
		if(x>=y){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}

	}
}
