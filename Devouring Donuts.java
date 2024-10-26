/*

DATE: 26/10/2024

  QUESTION:

Devouring Donuts
Chef baked a full tray of donuts, but couldn't resist and ate them all!

The tray had X donuts, and each donut contains Y calories.
How many calories did Chef consume in total?

Input Format
The only line of input contains two space-separated integers X and Y - the number of donuts and the calorie count of each one.

Output Format
Print a single integer: the total number of calories consumed by Chef.


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
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(x*y);

	}
}
