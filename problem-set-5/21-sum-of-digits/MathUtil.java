//Complete the given code to compute the sum of all odd digits of a integer.
//The integer may be positive or negative. (For example, if the input is 32677,
//the sum would be 3 + 7 + 7 = 17.)

//For the draft, print out the digits all on one line, separated by a space.
//Print a zero as the last number and return 0. If the input is 32677, the output will be
//3 2 6 7 7 0

public class MathUtil
{
   /**
    * Gets the sum of all the odd digits in the parameter
    * 
    * @param n the number to use
    * @return the sum of the odd digits.
    */
   public int sumOfOdd(int n)
   {
      int sum = 0;
      int digit;
      
      n = Math.abs(n);
      
      while (n > 0)
      {
          digit = n % 10;
          
          if (digit % 2 == 1)
          {
              sum = sum + digit;
          }
          
          n = n / 10;
      }

      return sum;
   }
}
