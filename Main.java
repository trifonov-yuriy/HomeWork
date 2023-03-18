import com.sun.org.apache.xml.internal.security.Init;

import java.util.Base64;
import java.util.Objects;
import java.util.Scanner;

public class Main
{
    private static String[] descriptions; //Описание вопросов
    private static String[][] questions; //Вопросы
    private static String[] answers; //Ответы

    private static int balls; //Количество правильных ответов
    private static String[] initDesctiptions()
    {
        String[] desctiptions = new String[]
        {
            "В какой файл скомпилируется java-файл?",
            "Сколько будет 2+2?",
            "Какой из перечисленных типов данных относится к целочисленным?",
        };

        return desctiptions;

    }
    private static String[] initAnswers()
    {
        String[] answers = new String[] {"4", "1", "3"};
        return answers;

    }

    private static String[][] initQuestions()
    {
        String[][] questions = new String[3][4]; //3 вопроса, 4 ответа
        questions[0][0] = "1) .java";
        questions[0][1] = "2) .exe";
        questions[0][2] = "3) .cs";
        questions[0][3] = "4) .class";

        questions[1][0] = "1) 4";
        questions[1][1] = "2) 2";
        questions[1][2] = "3) 3";
        questions[1][3] = "4) 5";

        questions[2][0] = "1) float";
        questions[2][1] = "2) double";
        questions[2][2] = "3) int";
        questions[2][3] = "4) char";

        return questions;
    }


    private static void startTest()
    {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < questions.length; i++)
        {
            System.out.println(descriptions[i]);
            for (int j = 0; j < questions[i].length; j++)
            {
                System.out.println("\t" + questions[i][j]);
            }
            System.out.print("Ответ: ");
            String answerUser = sc.nextLine();
            if(checkAnswer(answerUser, i))
            {
                balls++;
            }

        }

    }

    private static void finishTest()
    {
        System.out.println("Тест закончен");
        System.out.println("Количество правильных ответов: " + balls);

    }

    private static boolean checkAnswer(String answerUser, int answerIndex)
    {
        return Objects.equals(answerUser, answers[answerIndex]);

    }
    public static void main(String[] args)
    {
        descriptions = initDesctiptions();
        questions = initQuestions();
        answers = initAnswers();
        startTest();
        finishTest();

    }
}
