// formulas for surface area and volume
// http://math.about.com/od/formulas/ss/surfaceareavol.htm

// TODO: complete the code so that Sphere implements the GeometricSolid interface

/**
 * Models a Sphere.
 */
public class Sphere implements GeometricSolid
{
    private double radius;

    /**
     * Constructor for objects of class Sphere
     */
    public Sphere()
    {
        radius = 0;
    }

    /**
     * Constructs a Shpere with the given radius
     * 
     * @param r the radius
     */
    public Sphere(double r)
    {
        radius = r;
    }

    /**
     * Sets a new radius for the Sphere
     * 
     * @param r the radius
     */
    public void setRadius(double r)
    {
        radius = r;
    }

    /**
     * Gets the radius for the Sphere
     * 
     * @return the radius
     */
    public double getRadius()
    {
        return radius;
    }
    
    /**
     * Gets the volume of the Sphere
     * 
     * @return the volume
     */
    public double getVolume()
    {
        return 4 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    /**
     * Gets the surface area of the Sphere
     * 
     * @return the surface area
     */
    public double getSurfaceArea()
    {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
