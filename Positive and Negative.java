/*

Question:

Positive and Negative
Write a program to check whether the three given numbers as input are Positive, Negative, or Zero.

  Sample 1:
  INPUT             OUTPUT:
    20              Positive  
    0               Zero  
   -95              Negative


My Code:


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
         if(num > 0)
            System.out.println("Positive");
        else if(num == 0)
            System.out.println("Zero");
        else
            System.out.println("Negative");
        
        num = scanner.nextInt(); // input second number
        // Check second number
         if(num > 0)
            System.out.println("Positive");
        else if(num == 0)
            System.out.println("Zero");
        else
            System.out.println("Negative");
        
        num = scanner.nextInt(); // input third number
        // Check third number
         if(num > 0)
            System.out.println("Positive");
        else if(num == 0)
            System.out.println("Zero");
        else
            System.out.println("Negative");
    }
}
