/*



DATE: 05/11/2024

  QUESTION:



Puzzle Hunt
Chef and some of his friends are planning to participate in a puzzle hunt event.

The rules of the puzzle hunt state:
"This hunt is intended for teams of 6 to 8 people."Chef's team has N people in total. Are they eligible to participate?

Input Format
The first and only line of input will contain a single integer N: the number of people present in Chef's team.

Output Format
Print the answer: Yes if Chef's team is eligible to participate, and No otherwise.

Each letter in the output may be printed in either uppercase or lowercase, i.e, the outputs NO, No, nO, no will all be treated as equivalent.



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
		int N = s.nextInt();
		if(N<=6 || N>=8){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
	}
}
