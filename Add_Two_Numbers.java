/*

DATE: 18/10/2024

QUESTION:

Add Two Numbers

  Your task is very simple: given two integers A and B, write a program to add these two numbers and output the sum.


  Input Format
The first line contains an integer T, the total number of test cases.Then follow T lines, each line contains two integers, A and B.


  Output Format
For each test case, add A and B and display the sum in a new line.


  Sample 1:

  Input:                 Output:
    3                      3
  1  2                    300
  100 200                 50
  10 40              

  Explanation:
Testcase 1: 
1+2=3 Hence the first output is 3

Testcase 2: 
100+200=300. Hence the second output is 300

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
		int t = sc.nextInt();
		while(t-->0)
		{
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		// write your code here
    		System.out.println(a+b);
		}
		
	}
}
