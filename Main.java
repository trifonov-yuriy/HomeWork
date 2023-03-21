import java.util.ArrayList;

public class Main
{

    private static ArrayList<String> initRightAnswers(String[] rightAnswersArray)
    {
        ArrayList<String> rightAnswersList = new ArrayList<String>();

        for(int i = 0; i < rightAnswersArray.length; i++)
        {
            rightAnswersList.add(rightAnswersArray[i]);
        }

        return rightAnswersList;


    }

    private static ArrayList<IQuestion> initQuestions()
    {
        ArrayList<IQuestion> questions = new ArrayList<IQuestion>();

        IQuestion question = new Question
                (
                        "В какой формат скомпилируется java-файл?",
                        initRightAnswers(new String[] {"\t1) .exe", "\t2) .cs", "\t3) .java", "\t4) .class"}),
                        4
                );

        questions.add(question);


        question = new Question
                (
                        "Сколько будет 2+2?",
                        initRightAnswers(new String[] {"\t1) 1", "\t2) 2", "\t3) 3", "\t4) 4"}),
                        4
                );

        questions.add(question);


        question = new Question
                (
                        "Какой из перечисленных типов данных относится к целочисленным",
                        initRightAnswers(new String[] {"\t1) int", "\t2) double", "\t3) bool", "\t4) char"}),
                        1
                );

        questions.add(question);

        return questions;
    }



    public static void main(String[] args)
    {

        Test test = new Test(initQuestions());
        test.startTest();

    }



}