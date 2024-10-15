/*
DATE: 15/10/2024


Grades of Student
Write a program to print the grades of 3 students based on the marks they have obtained provided as input. The student is graded A if marks are greater than 90, B if marks are greater than 70, C if greater than or equal to 40, else F.

[Note: You need to take inputs for all 3 students.]

  Sample 1:

    INPUT:                    OUTPUT:
      95                          A
      40                          C
      20                          F

  MY CODE:

*/

  import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int num;
        num = scanner.nextInt(); // input first number
        // Check first number
        if(num > 90)
            System.out.println("A");
        else if(num > 70 && num <= 90)
            System.out.println("B");
        else if(num >= 40 && num <= 70)
            System.out.println("C");
        else
            System.out.println("F");
        
        num = scanner.nextInt(); // input second number
        // Check second number
        if(num > 90)
            System.out.println("A");
        else if(num > 70 && num <= 90)
            System.out.println("B");
        else if(num >= 40 && num <= 70)
            System.out.println("C");
        else
            System.out.println("F");
        
        num = scanner.nextInt(); // input third number
        // Check third number
        if(num > 90)
            System.out.println("A");
        else if(num > 70 && num <= 90)
            System.out.println("B");
        else if(num >= 40 && num <= 70)
            System.out.println("C");
        else
            System.out.println("F");
    }
}
