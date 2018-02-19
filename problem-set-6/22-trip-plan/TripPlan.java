//Complete the class TripPlan which describes the cities that are visited by a tour conducted
//by Java Now Tours. Keep an arraylist of cities (just the string name). Have methods to add a 
//city, remove a city, to return the names of the cities in a String, and to reverse the order 
//of the elements in the array list.

//Notice that the reverse method is void.

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 6 - Question 2" for some tips on 
// how to begin.

import java.util.ArrayList;

/**
 * A TripPlan represents a trip and holds a collection of city names.
 */
public class TripPlan
{
    ArrayList<String> list;

    /**
     * Constructs an empty trip.
     */
    public TripPlan()
    {
        list = new ArrayList<String>();
    }

    /**
     * Add a city to the list.
     * 
     * @param cityName the city to add
     */
    public void addCity(String cityName)
    {
        list.add(cityName);
    }

    /**
     * Returns a string describing the object.
     * 
     * @return a string in the format "TripPlan[cityName1,cityName2,...]"
     */
    public String toString()
    {
        String cityList = list.get(0);
        
        for (int i = 1; i < list.size(); i++)
        {
            String city = list.get(i);
            cityList = cityList + "," + city;
        }
        
        return "TripPlan[" + cityList + "]";
    }

    /**
     * Removes a city from this trip.
     * 
     * @param cityName city to remove
     */
    public void removeCity(String cityName)
    {
        list.remove(list.indexOf(cityName));
    }

    /**
     * Reverses the elements in the itinerary.
     */
    public void reverse()
    {
        int count = 0;
        int insertAt = 0;
        
        while(count < list.size())
        {
            list.add(insertAt, list.remove(list.size()-1));
            count++;
            insertAt++;
        }
    }
}