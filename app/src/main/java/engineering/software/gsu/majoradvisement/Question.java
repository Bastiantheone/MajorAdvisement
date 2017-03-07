package engineering.software.gsu.majoradvisement;

import java.util.ArrayList;

/**
 * Created by Bastian Wieck on 3/7/2017.
 */

public class Question {
    String text = "";
    ArrayList<Answer> answers = new ArrayList<Answer>();

    Question(String nText){
        this.text=nText;
    }

    public void add(Answer newAns){
        this.answers.add(newAns);
    }
}
