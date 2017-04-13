package engineering.software.gsu.majoradvisement;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Bastian Wieck on 3/11/2017.
 */

public class RateQuestion extends Question {
    public static final int NONE = 0;
    public static final int LITTLE = 1;
    public static final int SOME = 2;
    public static final int LOTS = 3;
    public static final int ALL = 4;

    private String text;
    private int score;
    private int cs;
    private int it;
    private int is;
    private int ce;

    public RateQuestion(String text, int score, int cs, int it, int is, int ce, int fun){
        this.text = text;
        this.score = score;
        this.cs = cs;
        this.it = it;
        this.is = is;
        this.ce = ce;
        super.FunValue = fun;
    }

    public String getText() {
        return text;
    }

    public int getScore() {
        return score;
    }

    public int getCs() {
        return cs;
    }

    public int getIt() {
        return it;
    }

    public int getIs() {
        return is;
    }

    public int getCe() {
        return ce;
    }

    @Override
    public void display(Activity activity){
        Intent intent = new Intent(activity,RateActivity.class);
        activity.startActivity(intent);
    }
}
