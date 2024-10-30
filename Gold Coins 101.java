/*

DATE: 30/10/2024


  QUESTION:


Gold Coins 101
Chef and Chefina are competing against each other in a football game where the player scoring the maximum goals, wins.

It is known that the winner of the game receives A gold coins while the loser receives B gold coins.
Given that Chef scored 
X goals and Chefina scored 
Y goals (X≠Y), find the number of coins Chef would receive.

Input Format
The first and only line of input will contain four space-separated integers, A,B,X, and Y, denoting the coins rewarded to winner, coins rewarded to loser, goals scored by Chef, and goals scored by Chefina respectively.

Output Format
  Output a single integer denoting the number of coins Chef would receive.

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
		int X = s.nextInt();
		int Y = s.nextInt();
		if(X>Y){
		    System.out.println(A);
		}
		else{
		    System.out.println(B);
		}

	}
}
