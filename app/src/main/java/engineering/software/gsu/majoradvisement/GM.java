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

    private int globalScore, globalCsScore, globalITScore, globalISScore, globalCEScore;
    private int funValue, fCS, fIT, fIS, fCE;

    public ArrayList<TextQuestion> questCS = new ArrayList<TextQuestion>();
    public ArrayList<TextQuestion> questIT = new ArrayList<TextQuestion>();
    public ArrayList<TextQuestion> questIS = new ArrayList<TextQuestion>();
    public ArrayList<TextQuestion> questCE = new ArrayList<TextQuestion>();

    //Use it to pull the next Question from the Array lists, uses combination of 2 methods
    //


    public TextQuestion nextTxtQuestion(){
        TextQuestion Selection = new TextQuestion("Blank", 0);
        int total = fCS + fIT + fIS + fCE;
        ArrayList<TextQuestion> focus = new ArrayList<TextQuestion>();
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

        Selection = fetchTxtQuestion(focus, funValue);


        return Selection;
    }

    public TextQuestion fetchTxtQuestion(ArrayList<TextQuestion> focus, int fun){
        TextQuestion dummy = new TextQuestion("example", 0);

        for(int i = 0; i < focus.size(); i++){
            if(fun == focus.get(i).FunValue){
                dummy = focus.get(i);
                return dummy;
            }
        }

        return dummy;
    }

    //This is where some sort of 'loading' method will go, will create a hardcode example to run this
    //section of the code

    public void loadTxtQuestions(){
        // Method for loading would go in here, you'd create an array list of questions and answers and feed them into each other and then
        //make the master list and edit the individual questions based on format
        //the usuage of it after the method is completed would be in the MyApplication.java class in order to allow us to edit it on initialization
    }

}
