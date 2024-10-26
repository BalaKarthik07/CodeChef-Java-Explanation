/*

DATE: 26/10/2024

  QUESTION:

Summer Time
Mamalesh likes to drink mango lassi when it's hot, and only when it's hot. If (and only if) the temperature on a given day is strictly greater than 35 degrees, Mamalesh will drink mango lassi.

Mamalesh sees that today's temperature is X degrees Celsius. Will he drink mango lassi today?
Print "Yes" if he will, and "No" otherwise (without quotes).

Input Format
The only line of input will contain a single integer X, denoting today's temperature.
Output Format
Print "YES" if Mamalesh will drink mango lassi today, and "NO" otherwise (without quotes).

Each letter of the output may be printed in either uppercase or lowercase, i.e, the strings NO, no, No, and nO will all be treated as equivalent.


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
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		if(X > 35){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}

	}
}
