// Complete the given class to shift the first picture (the one at index 0)
// to the end of the array list and  display the pictures object in the modified list
// horizontally as was done in the lesson. Put 10 pixels between pictures. The first
// picture should be 10 pixels from the left edge of the screen as well.
// You can find the pictures required in in the bluej project

import java.util.ArrayList;

/**
 * A program that moves the first picture to the end of the arraylist
 * and displays the modified list of pictures in a vertical line.
 *
 * @author  Silver Lumi
 * @version 1.0
 */
public class ShiftFirstToEnd
{
    public static void main(String[] args)
    {
        ArrayList<Picture> gallery = new ArrayList<Picture>();
        gallery.add(new Picture("degas1.jpg"));
        gallery.add(new Picture("gaugin1.jpg"));
        gallery.add(new Picture("monet1.jpg"));
        gallery.add(new Picture("monet2.jpg"));
        gallery.add(new Picture("renoir1.jpg"));

        // removes the picture from the index 0 and adds it to the end of the list
        gallery.add(gallery.remove(0));
        
        int rightmost = 0; // the x-coordinate of the rightmost side of the picture
        
        // for each picture in the gallery use the translate method of the picture
        // class (moves the top left corner of the picture by coordinates y = 0 and
        // x = the rightmost x-coordinate of the previous picture + 10 pixels
        for (Picture pic : gallery)
        {
            pic.translate(rightmost + 10, 0);
            pic.draw();
            rightmost = pic.getMaxX(); // updates the x-coordinate
        }
    }
}
