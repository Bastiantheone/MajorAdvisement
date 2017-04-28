package engineering.software.gsu.majoradvisement;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.ValueDependentColor;
import com.jjoe64.graphview.helper.StaticLabelsFormatter;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;

public class ScoreActivity extends AppCompatActivity {
    private GraphView graph;
    private TextView scoreTextView;
    private TextView linkTextView;
    private Button logoutButton;
    private Button continueButton;
    private Button startOverButton;
    private GM gm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        gm  = GM.initialize(this);

        DbConnect.get(this).updateGameMaster(gm);

        scoreTextView = (TextView)findViewById(R.id.score_text_view);
        String text = "Score: "+gm.globalScore ;
        scoreTextView.setText(text);

        logoutButton=(Button)findViewById(R.id.logout_button);
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScoreActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });

        // start over but skip the initial which major question
        continueButton=(Button)findViewById(R.id.continue_button);
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // FIXME instead of setting it back to 0 just continue. Needs more questions to have this
                gm.funValue = 0;
                Question q = gm.nextQuestion();
                if(q!=null)
                    q.display(ScoreActivity.this);
            }
        });

        // reset everything
        startOverButton = (Button)findViewById(R.id.start_over_button);
        startOverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gm.funValue = -1;
                gm.globalCEScore = 0;
                gm.globalITScore = 0;
                gm.globalISScore = 0;
                gm.globalCsScore = 0;
                gm.globalScore = 0;
                Question q = gm.nextQuestion();
                if(q!=null)
                    q.display(ScoreActivity.this);
            }
        });

        linkTextView = (TextView)findViewById(R.id.link_to_major_view);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
        if(gm.globalCsScore > gm.globalCEScore){
            if(gm.globalISScore > gm.globalITScore){
                if(gm.globalCsScore > gm.globalISScore)
                    linkTextView.setText(R.string.cs_link);
                else
                    linkTextView.setText(R.string.is_link);
            }else{
                if(gm.globalCsScore > gm.globalITScore)
                    linkTextView.setText(R.string.cs_link);
                else
                    linkTextView.setText(R.string.it_link);
            }
        }else{
            if(gm.globalISScore > gm.globalITScore){
                if(gm.globalCEScore > gm.globalISScore)
                    linkTextView.setText(R.string.ce_link);
                else
                    linkTextView.setText(R.string.is_link);
            }else{
                if(gm.globalITScore > gm.globalCEScore)
                    linkTextView.setText(R.string.it_link);
                else
                    linkTextView.setText(R.string.ce_link);
            }
        }

        graph = (GraphView)findViewById(R.id.graph);

        BarGraphSeries<DataPoint> series = new BarGraphSeries<>(new DataPoint[]{
                new DataPoint(1,gm.globalCsScore),
                new DataPoint(2,gm.globalCEScore),
                new DataPoint(3,gm.globalITScore),
                new DataPoint(4,gm.globalISScore)
        });
        graph.addSeries(series);

        // set Color depending on the height and position
        series.setValueDependentColor(new ValueDependentColor<DataPoint>() {
            @Override
            public int get(DataPoint data) {
                return Color.rgb((int) data.getX()*255/4, (int) Math.abs(data.getY()*255/6),100);
            }
        });
        series.setSpacing(50);

        // add numbers on top
        series.setDrawValuesOnTop(true);
        series.setValuesOnTopColor(Color.RED);

        // add labels
        StaticLabelsFormatter staticLabelsFormatter = new StaticLabelsFormatter(graph);
        staticLabelsFormatter.setHorizontalLabels(new String[]{"CS","CE","IT","IS"});
        graph.getGridLabelRenderer().setLabelFormatter(staticLabelsFormatter);
    }

    @Override
    public void onBackPressed(){
        //do nothing
    }
}
