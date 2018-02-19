/**
 * Complete the code in this method 
 * Define last and assign the last digit of the number to it
 */
public class Digits
{
    /**
     * Gets the last digit of a number
     * 
     * @param number the number whose last digit we want
     * @return the last digit of the parameter
     */
    
    public int lastDigit(int number)
    {
        int last = 0;
        
        if (number < 10)
        {
            last = (number);
        }
        else
        {
            last = (Math.abs(number) % 10);
        }
        
        return last;
    }
}
