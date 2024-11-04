/*

DATE: 04/11/2024

  QUESTION:


Sports Section
The newspaper in Chefland consists of 10 pages numbered 1 to 10.
The last 3 pages of the newspaper are always dedicated to the sports section.

Given a random page number X, determine whether that page is dedicated to the sports section.

Input Format
The first and only line of input consists of a single integer X, denoting the page number.
Output Format
Output on a new line, YES, if the given page number is dedicated to the sports section, and NO otherwise.

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
		// your code goes herent
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		if(x>7){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}

	}
}
