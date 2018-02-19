// TODO: add everything necessary for this class to implement Comparable

/**
 * Represents a circle whose radius is multiples of the unit circle - a circle 
 * with radius 1.
 */
public class UnitCircle implements Comparable
{
    private int radius;

    /**
     * Constructor for objects of class UnitCircle.
     * 
     * @param radius the radius of the circle
     */
    public UnitCircle(int radius)
    {
        this.radius = radius;
    }

    /**
     * Gets the radius of the circle.
     * 
     * @return the radius of the circle
     */
    public int getRadius()
    {
        return radius;
    }

    /**
     * Gets the string representation of the UnitCircle
     * 
     * @return the string representation
     */
    public String toString()
    {
        return "UnitCircle[r=" + radius + "]";
    }

    /**
     * Compares the two UnitCircle objects
     * 
     * @return difference of radiuses
     */
    public int compareTo(Object otherObject)
    {
        return this.radius - ((UnitCircle) otherObject).getRadius();
    }
}
