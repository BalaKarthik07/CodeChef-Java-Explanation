/*

DATE: 02/11/2024

  QUESTION:


Donation Drive
A blood drive aims to collect N number of blood donations.The drive has collected X donations so far. Find the remaining number of donations needed to reach the target.

Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case contains two space-separated integers N and X — the number of required donations and the number of collected donations, respectively.
Output Format
For each test case, output on a new line, the remaining number of donations needed to reach the target.



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
		while(T-->0){
		    int N = s.nextInt();
		    int X = s.nextInt();
		    System.out.println(N-X);
		}

	}
}
