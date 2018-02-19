//In this exercise we are going to manipulate images with the Picture class. We are
//studying 2D arrays so we will work with the 2D int array that is returned by
//Picture's getGraylevels method. This method is dicussed at the end of lesson 7.3.
//Each element of the array coresponds to a pixel in the image. The color has been
//transformed from an RGB color to a gray scale value.

//The Picture class also has a constructor that takes a 2D int array as a parameter.
//You will use that, too.

//Your task is to complete the two methods in the PictureUtil. Notice these are static methods.
//They do not act on instance variables of the PictureUtil class. In fact, the class has no
//instance data.

//Here is a description of the methods

//private static Picture grayAndFlipLeftToRight(Picture pic) :
//This method converts the image into a 2D array of gray scale values and then flips it
//left to right. That is, an object that was facing left will now be facing right.
//The elements on the left most column will be swapped with those in the right-most column
//and so on. Manipulate the elements in the array so that the first column is swapped with
//the last column and the second column is swapped with the next to the last and so on.
//Do not make a second array.
//Then call the Picture constructor that takes a 2D int array and return the picture.

//private static Picture grayAndRotate90(Picture pic):
//This method converts the image into a 2D array of gray scale values and then rotates it
//90 degrees clockwise (lays it on its right side) To do this, create a new array where
//the number of columns in the original array becomes the number of rows in the new array
//and the number of rows in the original becomes the number of colums. Then copy the elements
//from the first array into the proper place in the second array so that the image is
//rotated 90 degrees clockwise. The first row will become the last column
//[0][0] -> [0][numberOfColums - 1]

//There is a skeleton project for this problem that contains the graphics classes you will
//need, the tester, and the image used by the tester

/**
 * Methods to manipulate the Picture class
 */
public class PictureUtil
{
    /**
     * Gets a version of the given Picture in grayscale and flipped left to right
     * 
     * @param pic the Picture to convert to grayscale and flip
     * @return version of the original Picture in grayscale and flipped
     * left to right.
     */
    public static Picture grayAndFlipLeftToRight(Picture pic)
    {
        // get a grayscale version
        int[][] pixels = pic.getGrayLevels();
        
        // make a new array where the first row of the original becomes the last
        // column of the new array
        int nrOfRows = pixels.length;
        int nrOfColumns = pixels[0].length;
        
        // go through each row of the pixels array
        for (int row = 0; row < nrOfRows; row++)
        {
            // go through the columns, swapping the first pixel with
            // the last, second pixel with the second to last and so on
            // until reaching middle of the pixel array, in which case the
            // pixels from before and after have been swapped
            for (int column = 0; column < nrOfColumns / 2; column++)
            {
                int temp = pixels[row][column];
                pixels[row][column] = pixels[row][nrOfColumns - column -1];
                pixels[row][nrOfColumns - column - 1] = temp;
            }
        }
        
        // create and return the new Picture
        Picture grayAndFlipped = new Picture(pixels);
        return grayAndFlipped; 
    }

    /**
     * Gets a version of the given Picture in gray scale and rotated 90 degrees clockwise
     * 
     * @param pic the Picture to convert to gray scale and rotate 90 degrees clockwise
     * @return a version of the original Picture in gray scale and rotated 90 degrees clockwise
     */
    public static Picture grayAndRotate90(Picture pic)
    {
        // get a grayscale version
        int[][] pixels = pic.getGrayLevels();
        
        // rotate 90 degrees clockwise
        int initialRows = pixels.length;
        int initialColumns = pixels[0].length;
        
        // create a new array with the number of rows equal to number of 
        // columns of previous array and number columns equal to inital number ofrows
        int[][] rotatedPixels = new int[initialColumns][initialRows];
        
        for (int row = 0; row < initialColumns; row++)
        {
            for (int column = 0; column < initialRows; column++)
            {
                rotatedPixels[row][column] = pixels[initialRows - column - 1][row];
            }
        }
        
        // create and return the new Picture
        Picture grayAndRotated = new Picture(pixels);
        return grayAndRotated; 
    }
    
    public static Picture grayAndRotate100(Picture pic)
    {
        // Get a grayscale version
        int[][] pixels = pic.getGrayLevels();
        
        // TODO flip it left to right
        int oldRows = pixels.length;
        int oldColumns = pixels[0].length;
        int[][] rotatedPixels = new int[oldColumns][oldRows];
        
        for (int row = 0; row < oldColumns; row++)
        {
            for (int column = oldRows - 1; column >= 0; column--)
            {
                rotatedPixels[row][column] = pixels[column][row]; 
            }
        }
        // TODO create and return the new Picture
        Picture grayAndRotated = new Picture(rotatedPixels);
        return grayAndRotated; 
        
    }
} 

