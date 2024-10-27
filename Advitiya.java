/*

DATE: 27/10/2024

  QUESTION:

  Advitiya
IIT Ropar is hosting its tech fest, Advitiya, on the 16-th, 17-th, and 18-th of February.

Mehul, looking for a vacation, decides to visit Ropar in the month of February.
Mehul learned of Advitiya, and found out that there are no registration fees — even accommodation is being provided to the participants for free!
Team Advitiya is very welcoming, so Mehul definitely wants to attend the fest.

Mehul will visit Ropar on date N (which is between 1 and 18) of February. Will he be able to enjoy the fest?
Print "ADVITIYA" if N is one of the days on which Advitiya is running, and "WAITING FOR ADVITIYA" otherwise.

Input Format
The first line contains a single integer N, the date on which Mehul decided to visit Ropar.

Output Format
Print a single line containing the answer: "ADVITIYA" if Mehul visits on the right date, and "WAITING FOR ADVITIYA" otherwise.
Both strings are to be printed without the quotes.

Each character of the output may be printed in either uppercase or lowercase, i.e, the strings ADVITIYA, advitiya, and AdViTiYa will all be treated as equivalent.



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
		if(X < 16){
		    System.out.println("WAITING FOR ADVITIYA");
		}
		else  {
		    System.out.println("ADVITIYA");
		}

	}
}
