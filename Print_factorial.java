/*

DATE: 17/10/2024

QUESTION:

Print factorial
Write a program that uses a do-while loop to find the factorial of a given input number.

MY CODE:

*/

import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact=1;
        int i = 1;        
        do{
            fact*=i;
            i++;
        }
        while(i<=n);
        System.out.println(fact);
	}
	 
}
