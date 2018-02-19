// You are going to add a true/false type question to the question heirachy. Call it
// TrueFalseQuestion

// When the quiz is displayed, we want this text to preceed the question.
//      Answer True or False: question here
// We want the "Answer True or False: " to be prepended automatically.
// So if the user sets the text of the question to "Albert Einstein was the inventer of Java."
// the question will be displayed to the user like this
//      Answer True or False: Albert Einstein was the inventer of Java.

// Capitalization should not matter when determining if the answer is correct. Also t for true
// and f for false should be accepted.

// You will need to override three methods although not everyone will override the
// exact same three methods

// You will not need to add instance variables

/**
   A question with a text and an answer of True or False.
*/
public class TrueFalseQuestion extends Question
{
    public TrueFalseQuestion()
    {
        super();
    }
    
    public void display()
    {
        System.out.print("Answer True or False: ");
        super.display();
    }
    
    public void setAnswer(String correctResponse)
    {
        String answerInLowercase = correctResponse.toLowerCase();
        super.setAnswer(answerInLowercase);
    }
    
    public boolean checkAnswer(String response)
    {
        String responseInLowercase = response.toLowerCase();
        
        if (responseInLowercase.equals("t"))
        {
            return super.checkAnswer(responseInLowercase + "rue");
        }
        
        if (responseInLowercase.equals("f"))
        {
            return super.checkAnswer(responseInLowercase + "alse");
        }
        
        return super.checkAnswer(responseInLowercase);
    }
}
