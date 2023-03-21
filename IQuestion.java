import java.util.ArrayList;

public interface IQuestion {
    String getDescription();

    ArrayList<String> getAnswerOptions();

    int getRightAnswer();
}
