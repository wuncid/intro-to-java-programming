//Implement a class Balloon that models a spherical balloon that is being filled with air.  
//The constructor constructs an empty balloon (That is, the volume is 0).

//Supply these methods: 
//  void addAir(double amount) adds the given amount of air
//  double getVolume() gets the current volume
//  double getSurfaceArea() gets the current surface area
//  double getRadius() gets the current radius

/**
 * Models a spherical balloon that is being filled with air.
 */
public class Balloon
{
    private double volume;
    private double surfaceArea;
    private double radius;

    /**
     * Constructor for objects of class Balloon
     */
    public Balloon()
    {
        radius = 0;
        volume = 0;
        surfaceArea = 0;
    }
    
    /**
     * Adds the given amount of air
     * 
     * @param   the amount of air to add
     */
    void addAir(double amount)
    {
        volume = volume + amount;
        radius = Math.pow(3/4.0*volume/Math.PI,1/3.0);
        surfaceArea = 4*Math.PI*Math.pow(radius,2);
    }
    
    /**
     * Gets the volume of the Balloon
     *
     * @return    the volume of this balloon
     */
    double getVolume()
    {
        return volume;
    }
    
    /**
     * Gets the surface area of the Balloon
     *
     * @return    the surface area of this balloon
     */
    double getSurfaceArea() 
    {
        return surfaceArea;
    }
    
    /**
     * Gets the radius of the Balloon
     *
     * @return    the radius of this balloon
     */
    double getRadius()
    {
        return radius;
    }
    
}

