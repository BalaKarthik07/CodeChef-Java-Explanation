/*

DATE: 29/10/2024

  QUESTION:


Saving Taxes
In Chefland, everyone who earns strictly more than Y rupees per year, has to pay a tax to Chef. Chef has allowed a special scheme where you can invest any amount of money and claim exemption for it.

You have earned X(X>Y) rupees this year. Find the minimum amount of money you have to invest so that you don't have to pay taxes this year.

Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of a single line of input consisting of two space separated integers X and Y denoting the amount you earned and the amount above which you will have to pay taxes.
Output Format
For each test case, output a single integer, denoting the minimum amount you need to invest.


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
		for(int i=1;i<=T;i++){
		    int X = s.nextInt();
		    int Y = s.nextInt();
		    System.out.println(X-Y);
		}

	}
}
