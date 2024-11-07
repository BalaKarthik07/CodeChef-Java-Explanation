/*


DATE: 07/11/2024


  QUESTION:

RCB vs CSK
In the recent RCB vs CSK match, RCB batted first and scored X runs while CSK batted second and scored Y runs.

It is known that RCB qualifies to the playoffs if they win by at least 18 runs, otherwise CSK qualify. Knowing the final scores of both teams, find out who qualified to the playoffs.

Input Format
The only line of input contains 2 IntegerS
X and Y
Y - the final scores of RCB and CSK respectively.
Output Format
Output RCB if RCB managed to qualify to the playoffs, otherwise output CSK.

You may print each character of the string in uppercase or lowercase (for example, the strings RCB, rCb, rcb, and rcB will all be treated as identical).





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
		int y = s.nextInt();
		int z = x-y;
		if(z <18){
		    System.out.println("CSK");
		}
		else{
		    System.out.println("RCB");
		}

	}
}
