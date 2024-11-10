/*

DATE : 10/11/2024


  QUESTION:


Diwali Discount
Chef is trying to buy a Diwali gift for Rs. A, and he has a voucher for Rs. B. Chef will have to pay the remaining amount after applying the voucher. If the voucher's value exceeds the gift's value, Chef will not have to pay anything.

Find the amount that Chef will pay for buying the gift.

Input Format
The first and only line of input contains 2 integers - A and B.

  Output Format
For each test case, output on a new line the amount paid by Chef.


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
		int A = s.nextInt();
		int B = s.nextInt();
		if(A>B){
		    System.out.println(A-B);
		}
		else{
		    System.out.println(0);
		}

	}
}
