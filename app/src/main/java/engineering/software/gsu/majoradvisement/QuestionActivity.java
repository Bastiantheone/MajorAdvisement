package engineering.software.gsu.majoradvisement;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class QuestionActivity extends AppCompatActivity{
    private List<Answer> answers;
    Button aBtn, bBtn, cBtn, dBtn, nextButton;
    TextView Q;
    boolean a,b,c,d;
    private int increase;

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

        TextQuestion question = (TextQuestion)GM.currentQuestion;

        answers = question.getAnswers();
        Q.setText(question.getQuestionText());
        aBtn.setText(answers.get(0).getText());
        bBtn.setText(answers.get(1).getText());
        cBtn.setText(answers.get(2).getText());
        dBtn.setText(answers.get(3).getText());

        increase = 0;

        //Below are the methods to make the color swaps on the multiple choice question list: As well as set
        //the answers
        aBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=true;b=false;c=false;d=false;
                aBtn.setBackgroundColor(getResources().getColor(R.color.cyan));
                bBtn.setBackgroundColor(getResources().getColor(R.color.button_deselected));
                cBtn.setBackgroundColor(getResources().getColor(R.color.button_deselected));
                dBtn.setBackgroundColor(getResources().getColor(R.color.button_deselected));
            }
        });
        bBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=false;b=true;c=false;d=false;
                aBtn.setBackgroundColor(getResources().getColor(R.color.button_deselected));
                bBtn.setBackgroundColor(getResources().getColor(R.color.cyan));
                cBtn.setBackgroundColor(getResources().getColor(R.color.button_deselected));
                dBtn.setBackgroundColor(getResources().getColor(R.color.button_deselected));
            }
        });
        cBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=false;b=false;c=true;d=false;
                aBtn.setBackgroundColor(getResources().getColor(R.color.button_deselected));
                bBtn.setBackgroundColor(getResources().getColor(R.color.button_deselected));
                cBtn.setBackgroundColor(getResources().getColor(R.color.cyan));
                dBtn.setBackgroundColor(getResources().getColor(R.color.button_deselected));
            }
        });
        dBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=false;b=false;c=false;d=true;
                aBtn.setBackgroundColor(getResources().getColor(R.color.button_deselected));
                bBtn.setBackgroundColor(getResources().getColor(R.color.button_deselected));
                cBtn.setBackgroundColor(getResources().getColor(R.color.button_deselected));
                dBtn.setBackgroundColor(getResources().getColor(R.color.cyan));
            }
        });
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a){
                    //increase scores
                    increase += answers.get(0).getScore();
                    GM.globalScore+=answers.get(0).getScore();
                    GM.globalCsScore+=answers.get(0).getCsRating();
                    GM.globalITScore+=answers.get(0).getItRating();
                    GM.globalISScore+=answers.get(0).getIsRating();
                    GM.globalCEScore+=answers.get(0).getCeRating();
                }
                else if(b){
                    //increase scores
                    increase += answers.get(1).getScore();
                    GM.globalScore+=answers.get(1).getScore();
                    GM.globalCsScore+=answers.get(1).getCsRating();
                    GM.globalITScore+=answers.get(1).getItRating();
                    GM.globalISScore+=answers.get(1).getIsRating();
                    GM.globalCEScore+=answers.get(1).getCeRating();
                }
                else if(c){
                    //increase scores
                    increase += answers.get(2).getScore();
                    GM.globalScore+=answers.get(2).getScore();
                    GM.globalCsScore+=answers.get(2).getCsRating();
                    GM.globalITScore+=answers.get(2).getItRating();
                    GM.globalISScore+=answers.get(2).getIsRating();
                    GM.globalCEScore+=answers.get(2).getCeRating();
                }
                else if(d){
                    //increase scores
                    increase += answers.get(3).getScore();
                    GM.globalScore+=answers.get(3).getScore();
                    GM.globalCsScore+=answers.get(3).getCsRating();
                    GM.globalITScore+=answers.get(3).getItRating();
                    GM.globalISScore+=answers.get(3).getIsRating();
                    GM.globalCEScore+=answers.get(3).getCeRating();
                }

                next();
            }
        });
    }

    public void next(){
        Toast.makeText(this,"+ "+increase+" pts",Toast.LENGTH_SHORT).show();
        Question q = GM.initialize(this).nextQuestion();
        if(q!=null)
            q.display(this);
        else{
            Intent intent = new Intent(this,ScoreActivity.class);
            startActivity(intent);
        }
    }

    @Override
    public void onBackPressed(){
        //do nothing
    }

    @Override
    public void onPause(){
        super.onPause();
        DbConnect.get(this).updateGameMaster(GM.initialize(this));
    }
}
