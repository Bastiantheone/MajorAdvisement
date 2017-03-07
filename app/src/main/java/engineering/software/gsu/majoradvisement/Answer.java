package engineering.software.gsu.majoradvisement;

/**
 * Created by Bastian Wieck on 3/7/2017.
 */

public class Answer {
    String text = "Test";
    int score = 40;


    public void print(){
        System.out.println(this.text);
    }


    Answer(String nText){
        this.text = nText;
    }

    Answer(String ntext, int nScore){
        this.text = ntext;
        this.score = nScore;
    }
}
