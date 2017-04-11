package engineering.software.gsu.majoradvisement;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class RateActivity extends AppCompatActivity {
    private Button nextButton;
    private RatingBar ratingBar;
    private TextView textView;
    private RateQuestion rateQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);
        nextButton = (Button)findViewById(R.id.next_button);
        ratingBar = (RatingBar)findViewById(R.id.rating_bar);
        textView = (TextView)findViewById(R.id.question_text);

        rateQuestion = (RateQuestion)GM.currentQuestion;

        textView.setText(rateQuestion.getText());
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float rating = ratingBar.getRating();

                GM.globalScore+=rateQuestion.getScore();
                GM.globalCsScore+=calcScore(rateQuestion.getCs(),rating);
                GM.globalITScore+=calcScore(rateQuestion.getIt(),rating);
                GM.globalISScore+=calcScore(rateQuestion.getIs(),rating);
                GM.globalCEScore+=calcScore(rateQuestion.getCe(),rating);

                next();
            }
        });
    }

    public int calcScore(int score, float rating){
        float a = Math.abs(score-rating);
        return (int)((5 - a)*2);
    }

    public void next(){
        GM.initialize().nextQuestion().display(this);
    }
}
