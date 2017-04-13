package engineering.software.gsu.majoradvisement;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import java.util.ArrayList;

/**
 * Created by Bastian Wieck on 3/7/2017.
 */

public class TextQuestion extends Question {
    private String text;
    private ArrayList<Answer> answers;
    public TextQuestion(String text, int Fun, int id){
        this.text=text;
        answers = new ArrayList<>(4);
        super.FunValue = Fun;
        super.id = id;
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

    @Override
    public void display(Activity activity){
        Intent intent = new Intent(activity,QuestionActivity.class);
        activity.startActivity(intent);
    }
}
