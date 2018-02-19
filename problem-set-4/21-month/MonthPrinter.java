//Write a class MonthPrinter which will instantiate a Month object, ask the user
//for a month number and print the name of the month and the number or days.

//If the month is 6, the output should look exactly like this:
//June 30

//If the user enters an invalid month number print this error message: 
//"Number must be 1 through 12"
//(We include this even though our Month constructor will gracefully handle improper
//inputs. Using multiple safeguards against incorrect usage is a good idea!)

//If the user enters a non-integer, give this error message: 
//"Not an integer. Terminating"

//To be considered correct, you must enter the message exactly as specified, so be
//careful with the strings you print.

import java.util.Scanner;

/**
 * Gets user input and prints the name of the month and the number of days in that month.
 *
 * @author  Silver Lumi
 * @version 1.0
 */
public class MonthPrinter
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);

       System.out.print("Enter a month number (1 through 12) " );

       if (in.hasNextInt())
       {
            int monthNumber = in.nextInt();
            if (monthNumber < 1 || monthNumber > 12)
            {
                System.out.println("Number must be 1 through 12");
            }
            else
            {
                Month myMonth = new Month(monthNumber);
                System.out.println(myMonth.getMonthName() + " " + myMonth.getNumberOfDays());
            }
       }
       else
       {
           System.out.println("Not an integer. Terminating");
       }
   }
}
