package engineering.software.gsu.majoradvisement;

/**
 * Created by Bastian Wieck on 3/11/2017.
 */

public class RateQuestion {
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

    public RateQuestion(String text, int score, int cs, int it, int is, int ce){
        this.text = text;
        this.score = score;
        this.cs = cs;
        this.it = it;
        this.is = is;
        this.ce = ce;
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
}
