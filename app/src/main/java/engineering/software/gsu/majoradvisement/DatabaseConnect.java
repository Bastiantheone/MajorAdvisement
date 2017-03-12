package engineering.software.gsu.majoradvisement;

/**
 * Created by Bastian Wieck on 3/11/2017.
 */

//class that pulls the questions from the database
public class DatabaseConnect {


    //test methods
    public TextQuestion getTextQuestion(){
        TextQuestion test = new TextQuestion("Preferred Major");
        Answer cs = new Answer("CS",5,10,0,0,0);
        test.addAnswer(cs);
        Answer it = new Answer("IT",5,0,10,0,0);
        test.addAnswer(it);
        Answer is = new Answer("IS",5,0,0,10,0);
        test.addAnswer(is);
        Answer ce = new Answer("CE",5,0,0,0,10);
        test.addAnswer(ce);
        return test;
    }
    public SwipeQuestion getSwipeQuestion(){
        SwipeQuestion test = new SwipeQuestion("Software","Hardware");
        Image s = new Image(R.raw.code_image,20,5,5,5,5,0,0,0,0,0);
        test.addImage(s);
        Image h = new Image(R.raw.hardware_image,0,0,0,0,0,20,5,5,5,5);
        test.addImage(h);
        return test;
    }
    public RateQuestion getRateQuestion(){
        RateQuestion test = new RateQuestion("How much do you like Math?",5,RateQuestion.LOTS,RateQuestion.SOME,RateQuestion.LITTLE,RateQuestion.ALL);
        return test;
    }
}
