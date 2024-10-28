/*

DATE: 28/10/2024

  QUESTION:

AC Please
Chef is feeling the heat this summer and wants to switch on the Air Conditioning all the time, but since he doesn't want to harm the environment much, he only switches it on when the room temperature is strictly greater than 30 degrees celsius.

Given the room temperature, you need to find whether Chef will switch on the air conditioning or not.

Input Format
The only line of input will contain a single integer 
T - denoting the room temperature.

  
Output Format
Print YES if Chef will turn the Air Conditioning on, otherwise print NO.

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
		int T = s.nextInt();
		if(T > 30){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}

	}
}
