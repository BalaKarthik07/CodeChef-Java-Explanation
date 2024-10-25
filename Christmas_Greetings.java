DATE: 25/10/2024

  QUESTION:

  Christmas Greetings
Christmas is celebrated on 25 th  December every year.
You are given a day X in December. Determine whether it is Christmas.
Print CHRISTMAS if it is Christmas. Otherwise print ORDINARY.
Input Format
The input consists of a single integer 
X, denoting a day in December.
Output Format
Output on a new line CHRISTMAS, if it is Christmas and ORDINARY otherwise.
You may print each character in uppercase or lowercase. For example the strings CHRISTMAS, christmas, Christmas are all considered identical.

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
		if(X == 25)
		{
		    System.out.println("CHRISTMAS");
		}
		else{
		    System.out.println("ORDINARY");
		}

	}
}
