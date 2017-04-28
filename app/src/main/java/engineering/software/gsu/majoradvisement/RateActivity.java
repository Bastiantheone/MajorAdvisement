package engineering.software.gsu.majoradvisement;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class RateActivity extends AppCompatActivity {
    private static final String TAG = "RateActivity";
    private Button nextButton;
    private RatingBar ratingBar;
    private TextView textView;
    private RateQuestion rateQuestion;
    private int increase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);
        nextButton = (Button)findViewById(R.id.next_button);
        ratingBar = (RatingBar)findViewById(R.id.rating_bar);
        textView = (TextView)findViewById(R.id.question_text);

        rateQuestion = (RateQuestion)GM.currentQuestion;

        increase = 0;

        textView.setText(rateQuestion.getText());
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float rating = ratingBar.getRating();
                increase += rateQuestion.getScore();
                GM.globalScore+=rateQuestion.getScore();
                GM.globalCsScore+=calcScore(rateQuestion.getCs(),rating);
                GM.globalITScore+=calcScore(rateQuestion.getIt(),rating);
                GM.globalISScore+=calcScore(rateQuestion.getIs(),rating);
                GM.globalCEScore+=calcScore(rateQuestion.getCe(),rating);
                Log.d(TAG, "onClick: Cs:"+calcScore(rateQuestion.getCs(),rating)+ " IT: "+calcScore(rateQuestion.getIt(),rating));
                next();
            }
        });
    }

    public int calcScore(int score, float rating){
        float a = Math.abs(score-rating*2);
        return (int)(10-a);
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
