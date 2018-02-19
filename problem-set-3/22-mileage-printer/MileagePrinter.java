//Write a program called MilagePrinter that asks the user to input the following values:
//  The number of gallons currently in the tank
//  The fuel efficiency in miles per gallon

//and then prints how far the car can go on the gas in the tank and the cost of driving 100 miles. 
//Print the distance with 1 decimal point and the cost with 2 decimals.

//Use System.out.print and not System.out.println. Otherwise your output will not be
//formatted correctly

//Assume the cost per gallon is $3.95. Define it as a constant:
//     final double COST_PER_GALLON = 3.95;

//If value entered for efficiency is less than or equal to 0, print "No can go".
//Otherwise continue with the calculations. You output should be in the exact
//format shown below. The text will be identical - only the numbers will change.

//Sample runs for the final version:
//Enter the number of gallons of gas in the tank 5.1
//Enter the fuel efficiency 35.0
//Distance:   178.5
//Cost:       11.29

//Enter the number of gallons of gas in the tank 25
//Enter the fuel efficiency -5
//No can go 

//Important: Be sure to print the string exactly as shown 

import java.util.Scanner;

/**
 * Prints how far the car can go on the gas in the tank and 
 * the cost of driving 100 miles.
 */
public class MileagePrinter
{
   public static void main(String[] args)
   {
       final double COST_PER_GALLON = 3.95;

       Scanner input = new Scanner(System.in);
       
       // gets the user input for the initial amount of fuel in tank
       System.out.print("Enter the number of gallons of gas in the tank: ");
       while (!input.hasNextDouble()) 
       {
           System.out.println("Invalid input, try again: ");
           input.next();
       }
       double gasInTank = input.nextDouble();
            
       // gets the user input for the fuel efficiency of the car
       System.out.print("Enter the fuel efficiency, miles per gallon: ");
       while (!input.hasNextDouble()) 
       {
           System.out.print("Invalid input, try again: ");
           input.next();
       }
       double fuelEfficiency = input.nextDouble();
       
       // checks if the entered fuel efficiency and the gas in tank are 
       // positive values, if yes then does the calculations and prints
       // the results
       if (fuelEfficiency <= 0)
       {
           System.out.println("No can go ");
       }
       else if (gasInTank <= 0)
       {
           System.out.println("No can go ");
       }
       else
       {
           double distance = gasInTank * fuelEfficiency;
           double cost = COST_PER_GALLON * 100/fuelEfficiency;
           System.out.printf("%s%8.1f%n", "Distance:", distance);
           System.out.printf("%s%12.2f%n", "Cost:", cost);
       }
   }
}
