// formulas for surface area and volume
// http://math2.org/math/geometry/areasvols.htm

// TODO: complete the code so that Cube implements the GeometricSolid interface

/**
 * Models a cube.
 */
public class Cube implements GeometricSolid
{
    private double side;

    /**
     * Constructs a Cube with the given side length
     * 
     * @param s the length of the side
     */
    public Cube(double s)
    {
        side = s;
    }
    
    /**
     * Gets the volume of the Cube
     * 
     * @return the volume
     */
    public double getVolume()
    {
        return Math.pow(side, 3);
    }
    
    /**
     * Gets the surface area of the Cube
     * 
     * @return the surface area
     */
    public double getSurfaceArea()
    {
        return 6 * Math.pow(side, 2);
    }
}
