package engineering.software.gsu.majoradvisement;

import java.util.ArrayList;

/**
 * Created by Bastian Wieck on 3/7/2017.
 */

public class TextQuestion {
    private String text;
    private ArrayList<Answer> answers;
    public TextQuestion(String text){
        this.text=text;
        answers = new ArrayList<>(4);
    }
    public void addAnswer(Answer newAnswer){
        answers.add(newAnswer);
    }
    public ArrayList<Answer> getAnswers(){
        return answers;
    }
    public String getQuestionText(){
        return text;
    }
}
