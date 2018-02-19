//Write a class Month.

//A Month has a constructor that takes the month number as a parameter (1 for January,
//2 for February and so forth):
//   public Month(int monthNumber)
//If monthNumber is not 1 to 12, set it to 1.  (This final case you can think of as
//a kind of safeguard against someone using your Month class incorrectly: even if
//someone passes a bad number to your constructor, it will still make a valid month.
//You will make a separate safeguard in your MonthPrinter class to reject bad user
//inputs, but making your code as resiliant as possible to incorrect usage is good
//practice as a programmer!)

//The Month class has 2 methods:
//   public String getMonthName() Use if / else if /else if ...
//   public int getNumberOfDays() Do NOT use a separate if / else branch for each month. 
//Use Boolean operators (&&, ||, !). You will have an if then else if then else
//For February return 28

//These are implemented for you as stubs

/**
 * A month class that saves the month number and displays the name and the number of days in this month.
 */
public class Month
{
    private int month;

    /**
     * Contructs a Month.
     * 
     * @param the month number. Must be 1 to 12. For any other number, the month number is set to 1.
     */
    public Month(int theMonthNumber)
    {
        if (theMonthNumber > 0 && theMonthNumber <=12)
        {
            month = theMonthNumber;
        }
        else 
        {
            month = 1;
        }
    }

    /**
     * Gets the name of this month.
     * 
     * @return the name of this month
     */
    public String getMonthName()
    {
        String monthName = "";
        
        if (month == 1)
        {
            monthName = "January";
        }
        else if (month == 2)
        {
            monthName = "February";
        }
        else if (month == 3)
        {
            monthName = "March";
        }
        else if (month == 4)
        {
            monthName = "April";
        }
        else if (month == 5)
        {
            monthName = "May";
        }
        else if (month == 6)
        {
            monthName = "June";
        }
        else if (month == 7)
        {
            monthName = "July";
        }
        else if (month == 8)
        {
            monthName = "August";
        }
        else if (month == 9)
        {
            monthName = "September";
        }
        else if (month == 10)
        {
            monthName = "October";
        }
        else if (month == 11)
        {
            monthName = "November";
        }
        else if (month == 12)
        {
            monthName = "December";
        }
        
        return monthName;
    }

    /**
     * Gets the number of days in this month
     * 
     * @return the number of days in this month in a non-leap year
     */
    public int getNumberOfDays()
    {
        int numberOfDays;
        
        if (month == 2)
        {
            numberOfDays = 28;
        }
        else if (month == 4 || month == 6 || month == 9 
        || month == 11)
        {
            numberOfDays = 30;
        }
        else
        {
            numberOfDays = 31;
        }
        
        return numberOfDays;
    }
}

