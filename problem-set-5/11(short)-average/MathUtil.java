// Complete this method to read integer scores from the user and find the average
// Stop asking for input when the user enters a negative number
// keep a running total and keep track of the number of entries
// then find and return the average
// Be sure not to divide by 0. Return 0 if no scores are entered

import java.util.Scanner;

public class MathUtil
{
    /**
     * Reads integer scores from the user and finds the average. Stops asking for input
     * when the user enters a negative number.
     * 
     * @return the average of the score entries
     */
    public double averageScore()
    {
        Scanner input = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        int value;

        do
        {
            System.out.print("Enter a score. -1 to quit: ");
            
            while(!input.hasNextInt())
            {
                System.out.print("Invalid input, enter an integer: ");
                input.next();
            }
            
            value = input.nextInt();
            
            if (value >= 0)
            {
                sum = sum + value;
                count++;
            }
        }
        while (value >= 0);
        
        if (count == 0)
        {
            return 0;
        }
        
        else 
        {
            double average = sum / count;
            return average;
        }
    }
}
