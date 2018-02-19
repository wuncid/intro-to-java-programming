//Country names in French are feminine when they end with the letter e,
//masculine otherwise, except for the following which are masculine
//even though they end with e:

//le Belize
//le Cambodge
//le Mexique
//le Mozambique
//le Zaire
//le Zimbabwe

//Complete the method getCompleteName in the class CountryNames.
//getCompleteName takes the French name of a country as a parameter
//and adds the article: le for masculine or la for feminine,
//such as le Canada or la Belgique. However, if the country name starts
//with a vowel, use l'; for example, l'Afghanistan.

//For the following plural country names, use les:
//les Etats-Unis
//les Pays-Bas

//Here is a URL that gives English and French names for countries:
//http://www.btb.gc.ca/btb.php?lang=eng&cont=690

//Use helper methods to simplify your code and make it easier to read.

/**
 * Contains the method to add the proper article to a country name in French.
 */
public class CountryNames
{
    /**
     * Gets the name with the proper article
     * 
     * @param name the country name
     * @return the name prepended with the proper article
     */
    public String getCompleteName(String name)
    {
        String completeName = "";
        
        if ("aeiouAEIOU".contains(name.substring(0, 1)))
        {
            completeName = "l'" + name;
        }   
        else if (name.equals("Etats-Unis") || name.equals("Pays-Bas"))
        {
            completeName = "les " + name;
        }
        else if (name.equals("Belize") || name.equals("Cambodge") 
        || name.equals("Mexique") || name.equals("Mozambique")
        || name.equals("Zaire") || name.equals("Zimbabwe"))
        {
            completeName = "le " + name;
        } 
        else if (name.substring(name.length()-1, name.length()).equals("e"))
        {
            completeName = "la " + name;
        }
        else
        {
            completeName = "le " + name;
        }
        
        return completeName;
    }

}
