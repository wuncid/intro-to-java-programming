// Complete the given class to display the last picture in the array list
// The required pictures are in the BlueJ project

import java.util.ArrayList;

/**
 * A program that displays the last picture in the arraylist.
 *
 * @author  Silver Lumi
 * @version 1.0
 */
public class DisplayLastPictures
{
    public static void main(String[] args)
    {
        ArrayList<Picture> gallery = new ArrayList<Picture>();
        gallery.add(new Picture("degas1.jpg"));
        gallery.add(new Picture("gaugin1.jpg"));
        gallery.add(new Picture("monet1.jpg"));
        gallery.add(new Picture("monet2.jpg"));
        gallery.add(new Picture("renoir1.jpg"));

        Picture pic = gallery.get(gallery.size()-1);
        pic.draw();
    }
}

