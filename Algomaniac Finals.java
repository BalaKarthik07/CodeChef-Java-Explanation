/*

DATE: 06/11/2024

  QUESTION:



Algomaniac Finals
Algomaniac finals, a part of Convolution Fest of Jadavpur University, will be held on March 17 Shreyan can only go to Jadavpur University on March X.

Print YAY if he can attend the Algomaniac finals and NO if he cannot.

Input Format
The first and only line of input contains one integer, X, the day of march Shreyan can go to Jadavpur University.
Output Format
Output YAY if Shreyan can attend Algomaniac finals, and NO otherwise.

You may print each character of the string in uppercase or lowercase (for example, the strings YAY, yaY, yay, and Yay will all be treated as identical).




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
		if(x == 17){
		    System.out.println("YAY");
		}
		else{
		    System.out.println("NO");
		}
	}
}
