package engineering.software.gsu.majoradvisement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    private TextView scoreTextView;
    private GM gm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        scoreTextView = (TextView)findViewById(R.id.score_text_view);
        gm  = GM.initialize(this);
        String text = "Score: "+gm.globalScore +"\n"
                + "CS: "+gm.globalCsScore+"\n"
                + "IT: "+gm.globalITScore+"\n"
                + "IS: "+gm.globalISScore+"\n"
                + "CE: "+gm.globalCEScore;
        scoreTextView.setText(text);
    }
}
