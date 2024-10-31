/*

DATE: 31/10/2024


  QUESTION:

Biryani classes
According to a recent survey, Biryani is the most ordered food. Chef wants to learn how to make world-class Biryani from a MasterChef. Chef will be required to attend the MasterChef's classes for X weeks, and the cost of classes per week is Y coins. What is the total amount of money that Chef will have to pay?

Input Format
The first line of input will contain an integer 
T — the number of test cases. The description of T test cases follows.
The first and only line of each test case contains two space-separated integers X and Y, as described in the problem statement.
Output Format
For each test case, output on a new line the total amount of money that Chef will have to pay.


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
		    int X = s.nextInt();
		    int Y = s.nextInt();
		    System.out.println(X*Y);
		}

	}
}
