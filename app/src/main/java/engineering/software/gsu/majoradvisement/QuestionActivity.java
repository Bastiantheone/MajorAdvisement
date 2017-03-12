package engineering.software.gsu.majoradvisement;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class QuestionActivity extends AppCompatActivity{

    Button aBtn, bBtn, cBtn, dBtn, nextButton;
    TextView Q;
    boolean a,b,c,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        aBtn = (Button)findViewById(R.id.ans1button);
        bBtn = (Button)findViewById(R.id.ans2button);
        cBtn = (Button)findViewById(R.id.ans3button);
        dBtn = (Button)findViewById(R.id.ans4button);
        Q = (TextView)findViewById(R.id.questionText);
        nextButton = (Button)findViewById(R.id.next_button);

        //this needs to be changed
        DatabaseConnect db = new DatabaseConnect();
        TextQuestion question = db.getTextQuestion();

        final ArrayList<Answer> answers = question.getAnswers();
        Q.setText(question.getQuestionText());
        aBtn.setText(answers.get(0).getText());
        bBtn.setText(answers.get(1).getText());
        cBtn.setText(answers.get(2).getText());
        dBtn.setText(answers.get(3).getText());

        //Below are the methods to make the color swaps on the multiple choice question list: As well as set
        //the answers
        aBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=true;b=false;c=false;d=false;
                aBtn.setBackgroundColor(Color.CYAN);
                bBtn.setBackgroundColor(Color.RED);
                cBtn.setBackgroundColor(Color.RED);
                dBtn.setBackgroundColor(Color.RED);
            }
        });
        bBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=false;b=true;c=false;d=false;
                aBtn.setBackgroundColor(Color.RED);
                bBtn.setBackgroundColor(Color.CYAN);
                cBtn.setBackgroundColor(Color.RED);
                dBtn.setBackgroundColor(Color.RED);
            }
        });
        cBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=false;b=false;c=true;d=false;
                aBtn.setBackgroundColor(Color.RED);
                bBtn.setBackgroundColor(Color.RED);
                cBtn.setBackgroundColor(Color.CYAN);
                dBtn.setBackgroundColor(Color.RED);
            }
        });
        dBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=false;b=false;c=false;d=true;
                aBtn.setBackgroundColor(Color.RED);
                bBtn.setBackgroundColor(Color.RED);
                cBtn.setBackgroundColor(Color.RED);
                dBtn.setBackgroundColor(Color.CYAN);
            }
        });
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a){
                    //increase scores
                    /*
                    score+=answers.get(0).getScore();
                    csRating+=answers.get(0).getCsRating();
                    itRating+=answers.get(0).getItRating();
                    isRating+=answers.get(0).getIsRating();
                    ceRating+=answers.get(0).getCeRating();*/
                }
                else if(b){
                    //increase scores
                    /*
                    score+=answers.get(1).getScore();
                    csRating+=answers.get(1).getCsRating();
                    itRating+=answers.get(1).getItRating();
                    isRating+=answers.get(1).getIsRating();
                    ceRating+=answers.get(1).getCeRating();*/
                }
                else if(c){
                    //increase scores
                    /*
                    score+=answers.get(2).getScore();
                    csRating+=answers.get(2).getCsRating();
                    itRating+=answers.get(2).getItRating();
                    isRating+=answers.get(2).getIsRating();
                    ceRating+=answers.get(2).getCeRating();*/
                }
                else if(d){
                    //increase scores
                    /*
                    score+=answers.get(3).getScore();
                    csRating+=answers.get(3).getCsRating();
                    itRating+=answers.get(3).getItRating();
                    isRating+=answers.get(3).getIsRating();
                    ceRating+=answers.get(3).getCeRating();*/
                }

                //first decide which kind of question is next then call appropriate activity
                Intent i = new Intent(getBaseContext(),SwipeActivity.class);
                startActivity(i);
            }
        });
    }
}
