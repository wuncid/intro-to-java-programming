// Complete the code to find the volume of a cone with radius r and height h.
// Use Math.PI for pi

/**
 * A cone figure.
 */
public class Cone
{
    private int r;
    private int h;

    /**
     * Constructor for the Cone class
     * 
     * @param r, the radius of the cone
     * @param h, the height of the cone
     */
    public Cone(int r, int h)
    {
        this.r = r;
        this.h = h;
    }
   
    /**
     * Calculates the volume of the cone
     * 
     * @return the volume of the cone
     */
    public double getVolume()
    {
        double volume = 1 / 3.0 * Math.PI * Math.pow(this.r,2) * this.h;
        return volume;
    }
}