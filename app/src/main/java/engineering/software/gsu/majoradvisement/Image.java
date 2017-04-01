package engineering.software.gsu.majoradvisement;

/**
 * Created by Bastian Wieck on 3/11/2017.
 */
//left is when the image is swipped to the left, right is for the right
    // code was slightly redudant, changed it into a child of the Answer class for simplicity sake
public class Image  {
    private int imgID;

    private Answer leftAnswer;
    private Answer rightAnswer;
    /*private int leftScore;
    private int leftCSRating;
    private int leftITRating;
    private int leftISRating;
    private int leftCERating;

    private int rightScore;
    private int rightCSRating;
    private int rightITRating;
    private int rightISRating;
    private int rightCERating;*/

    public Image(int imgID, int leftScore, int leftCSRating, int leftITRating, int leftISRating, int leftCERating,
                 int rightScore, int rightCSRating, int rightITRating, int rightISRating, int rightCERating){
        this.imgID = imgID;
        this.leftAnswer = new Answer(imgID + "", leftScore, leftCSRating, leftITRating, leftISRating, leftCERating);
        this.rightAnswer= new Answer(imgID + "", rightScore, rightCSRating, rightITRating, rightISRating, rightCERating);

        /*this.leftScore = leftScore;
        this.leftCSRating = leftCSRating;
        this.leftITRating = leftITRating;
        this.leftISRating = leftISRating;
        this.leftCERating = leftCERating;
        this.rightScore = rightScore;
        this.rightCSRating = rightCSRating;
        this.rightITRating = rightITRating;
        this.rightISRating = rightISRating;
        this.rightCERating = rightCERating;*/

    }

    public int getImgID(){
        return imgID;
    }

    public int getLeftScore() {
        return leftAnswer.getScore();
    }

    public int getLeftCSRating() {
        return leftAnswer.getCsRating();
    }

    public int getLeftITRating() {
        return leftAnswer.getItRating();
    }

    public int getLeftISRating() {
        return leftAnswer.getIsRating();
    }

    public int getLeftCERating() {
        return leftAnswer.getCeRating();
    }

    public int getRightScore() {
        return rightAnswer.getScore();
    }

    public int getRightCSRating() {
        return rightAnswer.getCsRating();
    }

    public int getRightITRating() {
        return rightAnswer.getItRating();
    }

    public int getRightISRating() {
        return rightAnswer.getIsRating();
    }

    public int getRightCERating() {
        return rightAnswer.getCeRating();
    }
}
