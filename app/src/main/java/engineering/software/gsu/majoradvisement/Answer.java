package engineering.software.gsu.majoradvisement;

/**
 * Created by Bastian Wieck on 3/7/2017.
 */

public class Answer {
    private String text;
    private int score;
    private int csRating;
    private int itRating;
    private int isRating;
    private int ceRating;

    public Answer(String text, int score, int csRating, int itRating, int isRating, int ceRating){
        this.text = text;
        this.score = score;
        this.csRating = csRating;
        this.itRating = itRating;
        this.isRating = isRating;
        this.ceRating = ceRating;
    }

    public String getText() {
        return text;
    }

    public int getScore() {
        return score;
    }

    public int getCsRating() {
        return csRating;
    }

    public int getItRating() {
        return itRating;
    }

    public int getIsRating() {
        return isRating;
    }

    public int getCeRating() {
        return ceRating;
    }
}
