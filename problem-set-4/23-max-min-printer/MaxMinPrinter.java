//Write a class called MinMaxPrinter. Using a Scanner, ask the user to enter
//a series of integers and find the maximum and the minimum value.
//Use a loop.

//Do not let bad input (a non-integer) terminate your program with an error.
//When the user enters any non-integer, print the maximum and minimun values
//on separate line and quit.

//If the numbers entered are 5 10 3 8 1, 2 9, the output will be
//10
//1

//HINT: remember hasNextInt()
//HINT: initialize max to Integer.MIN_INTEGER rather than to 0 and min to 
//Integer.MAX_INTEGER before the loop.

import java.util.Scanner;

/**
 * Gets a series of integers from the user and prints the maximum and minimum values.
 */
public class MaxMinPrinter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.print("Enter an integer: ");
        while (in.hasNextInt())
        {
            int integer = in.nextInt();
            if (integer > max)
            {
                max = integer;
            }
            if (integer < min)
            {
                min = integer;
            }
            System.out.print("Enter an integer: ");
        }
        System.out.println(max);
        System.out.println(min);
    }
}
