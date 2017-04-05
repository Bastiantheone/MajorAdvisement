package engineering.software.gsu.majoradvisement;

import java.util.ArrayList;

/**
 * Created by Bastian Wieck on 3/7/2017.
 */

public class TextQuestion extends Question {
    private String text;
    private ArrayList<Answer> answers;
    int FunValue = 0;
    public TextQuestion(String text, int Fun){
        this.text=text;
        answers = new ArrayList<>(4);
        FunValue = Fun;
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


    public void display(){

    }
}
