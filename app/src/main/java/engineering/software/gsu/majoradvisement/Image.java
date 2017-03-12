package engineering.software.gsu.majoradvisement;

/**
 * Created by Bastian Wieck on 3/11/2017.
 */
//left is when the image is swipped to the left, right is for the right
public class Image {
    private int imgID;

    private int leftScore;
    private int leftCSRating;
    private int leftITRating;
    private int leftISRating;
    private int leftCERating;

    private int rightScore;
    private int rightCSRating;
    private int rightITRating;
    private int rightISRating;
    private int rightCERating;

    public Image(int imgID, int leftScore, int leftCSRating, int leftITRating, int leftISRating, int leftCERating,
                 int rightScore, int rightCSRating, int rightITRating, int rightISRating, int rightCERating){
        this.imgID = imgID;
        this.leftScore = leftScore;
        this.leftCSRating = leftCSRating;
        this.leftITRating = leftITRating;
        this.leftISRating = leftISRating;
        this.leftCERating = leftCERating;
        this.rightScore = rightScore;
        this.rightCSRating = rightCSRating;
        this.rightITRating = rightITRating;
        this.rightISRating = rightISRating;
        this.rightCERating = rightCERating;
    }

    public int getImgID(){
        return imgID;
    }

    public int getLeftScore() {
        return leftScore;
    }

    public int getLeftCSRating() {
        return leftCSRating;
    }

    public int getLeftITRating() {
        return leftITRating;
    }

    public int getLeftISRating() {
        return leftISRating;
    }

    public int getLeftCERating() {
        return leftCERating;
    }

    public int getRightScore() {
        return rightScore;
    }

    public int getRightCSRating() {
        return rightCSRating;
    }

    public int getRightITRating() {
        return rightITRating;
    }

    public int getRightISRating() {
        return rightISRating;
    }

    public int getRightCERating() {
        return rightCERating;
    }
}
