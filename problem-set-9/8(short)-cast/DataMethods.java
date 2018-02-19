// Complete the method getLength() which takes a Comparable object as its parameter.
// If the parameter references a String object, return the length of the String
// otherwise return -1.

public class DataMethods
{
    /**
     * Gets the length of the object if it is a string
     * 
     * @param c the object whose length we want
     * @return the length if the object is a string otherwise -1
     */
    public static int getLength(Object obj)
    {
        if (obj instanceof String)
        {
            return ((String) obj).length();
        }
        
        return -1;
    }
}