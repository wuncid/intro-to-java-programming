// This problem has several parts.
// First complete the GeometricSolid interface. The interface has two methods
//      1) getVolume 
//      2) getSurfaceArea
// both of which return a double
//
// Then modify the both the Sphere and the Cube method to implement the
// GeometricSolid interface

/**
 * Describes any geometric solid class.
 */
public interface GeometricSolid
{
    /**
     * Computes the volume of the object.
     * 
     * @return the volume
     */
    double getVolume();
    
    /**
     * Computes the surface area of the object.
     * 
     * @return the surface ares
     */
    double getSurfaceArea();
}
