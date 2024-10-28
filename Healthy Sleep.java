/*

DATE: 29/10/2024

QUESTION:

Healthy Sleep
At IIITA, students have diverse sleep patterns, and there isn't a fixed duration for their daily sleep.
Typical scientific recommendations suggest that the duration of a healthy sleep is 8 hours per day.
As you begin your journey as a programmer, you've been tasked by the renowned programmer of IIITA, Pavitra Pandey, with your first project.

Your assignment is to write a program that takes as input the number of hours a student sleeps per day, and judges how good their sleep schedule is. Specifically,

If the student sleeps for strictly less than 8 hours, the program should output LESS.
If the student sleeps for exactly 8 hours, the program should output PERFECT.
If the student sleeps for strictly more than 8 hours, the program should output MORE.
Can you write such a program?

Input Format
The only line of input contains a single integer H, denoting the number of hours a student sleeps per day.
Output Format
Output a single string containing the answer:

LESS if the student doesn't get enough sleep.
PERFECT if the student sleeps the perfect amount of time.
MORE if the student sleeps too much.
Each character of the output may be printed in either uppercase or lowercase, i.e, the strings LESS, less, LeSs, and lesS will all be treated as equivalent.



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
		int H = s.nextInt();
		if(H<8){
		    System.out.println("LESS");
		}
	    else if(H==8){
	        System.out.println("PERFECT");
	    }
	    else{
	        System.out.println("MORE");
	    }
		    
		

	}
}
