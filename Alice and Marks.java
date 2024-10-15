/*

DATE: 16/10/2024

QUESTION:

Alice and Marks
Alice has scored 
X
X marks in her test and Bob has scored 
Y
Y marks in the same test. Alice is happy if she scored at least twice the marks of Bob’s score. Determine whether she is happy or not.

Input Format
The first and only line of input contains two space-separated integers 
X
,
Y
X,Y — the marks of Alice and Bob respectively.
Output Format
For each testcase, print Yes if Alice is happy and No if she is not, according to the problem statement.

The judge is case insensitive so you may output the answer in any case. In particular YES, yes, yEsare all considered equivalent toYes`.

  MY CODE:

*/

import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		// write your code here
		if(x >= y*2){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
		
	}
}
