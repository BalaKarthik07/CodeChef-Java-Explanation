/*

DATE: 18/10/2024

QUESTION:

Good Turn

  Chef and Chefina are playing with dice. In one turn, both of them roll their dice at once.
  They consider a turn to be good if the sum of the numbers on their dice is greater than 6.
  Given that in a particular turn Chef and Chefina got X and Y on their respective dice, find whether the turn was good.

  Input Format

  The first line of input will contain a single integer T, denoting the number of test cases.
  Each test case contains two space-separated integers X and Y — the numbers Chef and Chefina got on their respective dice.

  Output Format

  For each test case, output on a new line, YES, if the turn was good and NO otherwise.
  Each character of the output may be printed in either uppercase or lowercase. That is, the strings NO, no, nO, and No will be treated as equivalent.

  Sample 1:

    INPUT:                  OUTPUT:
      4                        NO
    1 4                       YES
    3 4                       NO
    4 2                       YES
    2 6                      

  Explanation:

    Test case 1: The sum of numbers on the dice is 1+4=5 which is smaller than 6. Thus, the turn is not good.
    Test case 2: The sum of numbers on the dice is 3+4=7 which is greater than 6. Thus, the turn is good.


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
    		int x = sc.nextInt();
    		int y = sc.nextInt();
    		// write your code here
    		if((x+y)>6){
    		    System.out.println("YES");
    		}
    		else{
    		    System.out.println("NO");
    		}
		}
		
	}
}

    
