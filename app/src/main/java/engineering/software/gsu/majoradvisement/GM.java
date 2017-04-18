package engineering.software.gsu.majoradvisement;

import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;
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
    public List<Question> questCS = new ArrayList<Question>();
    public List<Question> questIT = new ArrayList<Question>();
    public List<Question> questIS = new ArrayList<Question>();
    public List<Question> questCE = new ArrayList<Question>();

    public static Question currentQuestion;
    private static final String TAG = "Game Master";

    //Use it to pull the next Question from the Array lists, uses combination of 2 methods
    //

    public static GM initialize(Context context){
        if(Alpha == null){
            Alpha = new GM();
            Alpha.loadQuestions(context);
        }
        else{
            return Alpha;
        }
        return Alpha;
    }

    private GM(){};

    public Question nextQuestion(){
        // FIXME figure out a good way to increase fun. Also save GM to database on finish or logout
        funValue+=1;
        int total = fCS + fIT + fIS + fCE;
        List<Question> focus = new ArrayList<Question>();
        Random random = new Random();
        int randomNum = random.nextInt(total+ 1);
        Log.d(TAG, "nextQuestion: "+randomNum+" and total "+total);
        if (randomNum <= fCS){
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

        Question Selection = fetchQuestion(focus, funValue);


        return Selection;
    }

    public Question fetchQuestion(List<Question> focus, int fun){
        // enough fun, time for the score activity FIXME decide on a good fun value to stop, maybe reset fun in score activity
        if(fun >= 20)
            return null;
        for(int i = 0; i < focus.size(); i++){
            if(fun == focus.get(i).FunValue){
                Question dummy = focus.get(i);
                currentQuestion = dummy;
                return dummy;
            }
        }
        Log.d(TAG, "fetchQuestion: focus: "+focus.size());
        // if dummy == null then the activity will call Score activity
        return null;
    }

    //This is where some sort of 'loading' method will go, will create a hardcode example to run this
    //section of the code

    public void loadQuestions(Context context){
        // Method for loading would go in here, you'd create an array list of questions and answers and feed them into each other and then
        //make the master list and edit the individual questions based on format
        //the usage of it after the method is completed would be in the MyApplication.java class in order to allow us to edit it on initialization
        DbConnect dbConnect = DbConnect.get(context);
        questCS = dbConnect.getQuestion(1);
        questCE = dbConnect.getQuestion(2);
        questIT = dbConnect.getQuestion(3);
        questIS = dbConnect.getQuestion(4);
    }

}
