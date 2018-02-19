// Complete the given class to display the picture object vertically
// (rather than horizontally).
// You can find the pictures required in the bluej project
// Place the first picture so that the top of the picture is 10 pixels below 
// the top of the canvas and put 10 pixels between the pictures

import java.util.ArrayList;

/**
 * A program that draws pictures in a vertical column.
 *
 * @author  Silver Lumi
 * @version 1.0
 */
public class ListOfVerticalPictures
{
    public static void main(String[] args)
    {
        ArrayList<Picture> gallery = new ArrayList<Picture>();
        gallery.add(new Picture("degas1.jpg"));
        gallery.add(new Picture("gaugin1.jpg"));
        gallery.add(new Picture("monet1.jpg"));
        gallery.add(new Picture("monet2.jpg"));
        gallery.add(new Picture("renoir1.jpg"));

        int bottom = 0; // y coordinate of the bottom side of a picture
        
        // for each picture in the gallery use the translate method of the picture
        // class (moves the top left corner of the picture by coordinates x = 0 and
        // y = the bottom coordinate of the previous picture + 10 pixels
        for (Picture pic : gallery)
        {
            pic.translate(0, bottom + 10);
            pic.draw();
            bottom = pic.getMaxY(); // update the bottom y-coordinate
        }
    }
}
