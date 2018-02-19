/**
 * Complete the method below so that it returns the correct letter grade
 * for the number grade and return the letter grade as a string
 */
public class GradeBook
{
    String letterGrade = "F";
    
    /**
     * Gets the letter grade associated with this numeric grade
     * 
     * @param grade the numeric grade
     * @return the corresponding letter grade
     */
    public String getLetterGrade(int grade)
    {
        if (grade >= 90)
        {
            letterGrade = "A";
        }
        else if (grade >= 80 && grade < 90)
        {
            letterGrade = "B";
        }
        else if (grade >= 70 && grade <80)
        {
            letterGrade = "C";
        }
        else if (grade >= 60 && grade <70)
        {
            letterGrade = "D";
        }
        return letterGrade;
    }
}
