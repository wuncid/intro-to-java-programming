// Complete the method to return the product of
// all the numbers 1 to the parameter n (inclusive)

public class MathUtil
{
   /**
    * Returns the product of all the numbers 1 to the parameter n (inclusive)
    * 
    * @param    n   the number to use
    * @return       the product of 1, ..., n-1, n
    */
   public int product(int n)
   {
        int sum = 1;
        
        for (int i = 2; i <= n; i++)
        {    
            sum = sum * i;
        }
        
        return sum;
   }
}
