/* 

DATE: 16/10/2024


QUESTION:


Chef defines a pair of positive integers 
(𝑎,𝑏)
(a,b) as a Oneful Pair if:

𝑎+𝑏+(𝑎⋅𝑏)=111
a+b+(a⋅b)=111
Your task is to determine if the given pair of integers 
𝑎
a and 
𝑏
b form a Oneful Pair. If they do, print "Yes", otherwise print "No".

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
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// write your code here
		if((a+b+(a*b)) == 111){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
		
	}
}
