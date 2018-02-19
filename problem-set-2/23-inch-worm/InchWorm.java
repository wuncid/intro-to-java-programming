// Write a class InchWorm that models an inch worm moving along a 
// horizontal line. The inch worm  moves either to the right or left.
// Initially, the inch worm moves to the right, but it can turn to
// change its direction. In each move, its position changes by one
// unit in the current direction. 

// Provide two constructors. 
// One that takes the initial position as an argument,
// and one with no arguments that sets the initial position to 0. 

// You will need two instance variables. 
// One to keep track of the position and one to keep track of the direction. 
// You can use 1 to represent moving right and -1 to represent moving left. 

// Constructors:
// public InchWorm()
// public InchWorm (int initialPosition)

// Provide these methods:
// public void turn()
// public void move()
// public int getPosition()

// Sample usage:
// InchWorm worm = new InchWorm (10);
// worm.move(); // Now the position is 11
// worm.turn();
// worm.move(); // Now the position is 10

/**
 * Inch worm moving along a horizontal line.
 */
public class InchWorm
{
    private int position;
    private int direction;
   
    /**
    * Constructs the inchworm with initial position 0.
    */
    public InchWorm()
    {
       position = 0;
       direction = 0;
    }
    
    /**
    * Constructs the inchworm with a custom initial position.
    * 
    * @param initialPosition initial position of the inchworm
    */
    public InchWorm (int initialPosition)
    {
        position = initialPosition;
        direction = 0;
    }
    
    /**
    * Updates the position of the inchworm.
    */
    public void move()
    {
        if (direction == 0)
        {
            position = position + 1;
        }
        else
        {
            position = position - 1;
        }
    }
    
    /**
    * Updates the direction of the inchworm.
    */
    public void turn()
    {
        if (direction == 0)
        {
            direction = 1;
        }
        else
        {
            direction = 0;
        }
    }
   
    /**
    * Returns the current position of the inchworm.
    * 
    * @return position of the inchworm
    */
    public int getPosition()
    {
        return position;
    }
   
    /**
    * Returns the current direction of the inchworm.
    * 
    * @return direction of the inchworm
    */
    public int getDirection()
    {
        return direction;
    }
}
