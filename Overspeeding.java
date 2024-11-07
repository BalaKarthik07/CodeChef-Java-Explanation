/*

DATE: 07/11/2024

  QUESTION:


Overspeeding
Alice is going for a drive. During her drive, she reached a maximum speed of S km/hr.As per the rules of the government, the speed of the vehicle must not exceed 40 km/hr, otherwise the person will be fined.You need to tell whether Alice will be fined or not.

Input Format
The only line of input will contain a single integer 
S - denoting the maximum speed Alice reached while driving.
Output Format
Print YES if Alice will be fined , otherwise print NO.

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
		int S = s.nextInt();
		if(S <= 40){
		    System.out.println("NO");
		}
		else{
		    System.out.println("YES");
		}

	}
}
