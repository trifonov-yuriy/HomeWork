import java.util.ArrayList;
import java.util.Scanner;

public class Test
{
    private ArrayList<IQuestion> questions;
    private int balls; //Количество верных ответов
    public Test(ArrayList <IQuestion> questions)
    {
        this.questions = questions;

    }

    private boolean checkAnswer(String answer, IQuestion question)
    {

        try
        {
            int answerInt = Integer.parseInt(answer);
            if(answerInt == question.getRightAnswer())
            {
                return true;
            }
            return false;

        }
        catch (NumberFormatException e)
        {
            return false;
        }

    }

    private void finishTest()
    {
        System.out.println("Тест закончен\nКоличество правильных ответов: " + balls);
    }

    public void startTest()
    {
        Scanner in = new Scanner(System.in);
        for (IQuestion question : questions)
        {
            System.out.println(question.getDescription());

            for(String answer : question.getAnswerOptions())
            {
                System.out.println(answer);
            }

            System.out.print("Ответ: ");
            String answer = in.nextLine();
            if(checkAnswer(answer, question))
            {
                balls++;
            }
        }


        finishTest();
    }



}