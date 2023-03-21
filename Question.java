import java.util.ArrayList;

public class Question implements IQuestion
{
    private String description; //Описание

    private ArrayList<String> answerOptions; //Варианты ответов

    private int rightAsnwer; //Верный ответ

    public Question(String description, ArrayList<String> answerOptions, int rightAsnwer)
    {
        this.description = description;
        this.answerOptions = answerOptions;
        this.rightAsnwer = rightAsnwer;
    }

    public String getDescription()
    {
        return description;
    }

    public ArrayList<String> getAnswerOptions()
    {
        return answerOptions;
    }

    public int getRightAnswer()
    {
        return rightAsnwer;
    }

}