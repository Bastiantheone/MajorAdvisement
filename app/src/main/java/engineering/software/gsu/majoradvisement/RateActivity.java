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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);
        nextButton = (Button)findViewById(R.id.next_button);
        ratingBar = (RatingBar)findViewById(R.id.rating_bar);
        textView = (TextView)findViewById(R.id.question_text);

        //change this
        DatabaseConnect db = new DatabaseConnect();
        final RateQuestion rateQuestion = db.getRateQuestion();

        textView.setText(rateQuestion.getText());
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float rating = ratingBar.getRating();
                /*
                score+=rateQuestion.getScore();
                csRating+=rateQuestion.getCs()*rating;
                itRating+=rateQuestion.getIt()*rating;
                isRating+=rateQuestion.getIs()*rating;
                ceRating+=rateQuestion.getCe()*rating;*/

                //change this
                Intent intent = new Intent(getBaseContext(),QuestionActivity.class);
                startActivity(intent);
            }
        });
    }
}
