//Create a Polygon class. A polygon is a closed shape with lines joining the corner points.
//You will keep the points in an array list. Use object of java.awt.Point for the point.

//Polygon will have as an instance variable an ArrayList of Points to hold the points
//The constructor takes no parameters but initializes the instance variable.  The
//Polygon class also has the following methods:
//    add: adds a Point to the polygon
//    perimeter: returns the perimeter of the polygon
//    draw: draws the polygon by connecting consecutive points and then
//          connecting the last point to the first.

//No methods headers or javadoc is provided this time. You get to try your hand at writing
//a class almost from scratch

import java.util.ArrayList;
import java.awt.Point;

/**
 * A polygon class with methods to manipulate the polygon.
 */
public class Polygon
{
    ArrayList<Point> polygon;
    
    /**
     * Constructs an empty polygon.
     */
    public Polygon()
    {
        polygon = new ArrayList<Point>();
    }
    
    /**
     * Add a point to the polygon.
     * 
     * @param x the X coordinate of this point
     * @param y the Y coordinate of this point
     */
    public void add(Point newPoint)
    {
        polygon.add(newPoint);
    }
    
    /**
     * Gets the perimeter of the polygon.
     */
    public double perimeter()
    {
        // set the perimeter as the distance between the first and the last point
        double perimeter =  Math.sqrt(Math.pow(polygon.get(0).getX() - 
                            polygon.get(polygon.size() - 1).getX(), 2) + 
                            Math.pow(polygon.get(0).getY() - 
                            polygon.get(polygon.size()-1).getY(), 2));
        
        // starting from the first and the second point in the array list
        // calculate the distances between the points of the rest of the array list
        // and add them to the perimeter
        for (int i = 0; i < polygon.size() - 1; i++)
        {
            Point point1 = polygon.get(i);
            Point point2 = polygon.get(i+1);
            perimeter = perimeter + Math.sqrt(Math.pow(point1.getX() - 
                        point2.getX(), 2) + Math.pow(point1.getY() - 
                        point2.getY(), 2));
        }
        
        return perimeter;
    }
    
    /**
     * Draws the polygon.
     */
    public void draw()
    {
        // draw the line between the first and the last point in the array list
        Line line0 = new Line(polygon.get(0).getX(), polygon.get(0).getY(), polygon.get(polygon.size()-1).getX(), polygon.get(polygon.size()-1).getY());
        line0.draw();
        
        // draw the lines between all other points in the array list
        for (int i = 0; i < polygon.size() - 1; i++)
        {
            Line line1 = new Line(polygon.get(i).getX(), polygon.get(i).getY(), polygon.get(i + 1).getX(), polygon.get(i + 1).getY());
            line1.draw();
        }
    }
}