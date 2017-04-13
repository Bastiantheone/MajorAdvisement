package engineering.software.gsu.majoradvisement;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Kwame on 3/26/2017.
 */

    //Responsible for instantion of the questions
    // Also holds the score, if we use a database save system we'll likely load up an 'instance'
    //of the GM (or Game master) class
    //the 'fun' value is what we'll use to determine at what step in the chain will certain questions
    //pop up

public class GM {
    public static int globalScore, globalCsScore, globalITScore, globalISScore, globalCEScore;
    public static int funValue, fCS, fIT, fIS, fCE;
    private static GM Alpha;
    public ArrayList<Question> questCS = new ArrayList<Question>();
    public ArrayList<Question> questIT = new ArrayList<Question>();
    public ArrayList<Question> questIS = new ArrayList<Question>();
    public ArrayList<Question> questCE = new ArrayList<Question>();

    public static Question currentQuestion;

    //Use it to pull the next Question from the Array lists, uses combination of 2 methods
    //

    public static GM initialize(){
        if(Alpha == null){
            Alpha = new GM();
            Alpha.loadQuestions();
        }
        else{
            return Alpha;
        }
        return Alpha;
    }

    private GM(){};

    public Question nextQuestion(){
        Question Selection = new Question();
        int total = fCS + fIT + fIS + fCE;
        ArrayList<Question> focus = new ArrayList<Question>();
        Random random = new Random();
        int randomNum = random.nextInt(total) + 1 ;

        if (randomNum < fCS){
            focus = questCS;
        }
        else if(randomNum < (fCS + fIT)){
            focus = questIT;
        }
        else if(randomNum < (fCS + fIT + fIS)){
            focus = questIS;
        }
        else if(randomNum <= (fCS + fIT + fIS + fCE)){
            focus = questCE;
        }

        Selection = fetchQuestion(focus, funValue);


        return Selection;
    }

    public Question fetchQuestion(ArrayList<Question> focus, int fun){
        Question dummy = new Question();

        for(int i = 0; i < focus.size(); i++){
            if(fun == focus.get(i).FunValue){
                dummy = focus.get(i);
                return dummy;
            }
        }
        currentQuestion = dummy;
        return dummy;
    }

    //This is where some sort of 'loading' method will go, will create a hardcode example to run this
    //section of the code

    public void loadQuestions(){
        // Method for loading would go in here, you'd create an array list of questions and answers and feed them into each other and then
        //make the master list and edit the individual questions based on format
        //the usuage of it after the method is completed would be in the MyApplication.java class in order to allow us to edit it on initialization

        //set the first question
    }

}
