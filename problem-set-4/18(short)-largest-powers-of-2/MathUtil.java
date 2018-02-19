/**
 * Complete the method to find the largest power of 2 less than the given number
 * Use a loop
 */
public class MathUtil
{
   public int largestPowerOf2(int n)
   {
       int power = 2;
       
       while (power < n)
       {
           power *= 2;
       }
       
       return power/2;
   }
}
