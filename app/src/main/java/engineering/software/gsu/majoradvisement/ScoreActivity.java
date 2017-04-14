package engineering.software.gsu.majoradvisement;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
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
    private GM gm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        gm  = GM.initialize(this);

        scoreTextView = (TextView)findViewById(R.id.score_text_view);
        String text = "Score: "+gm.globalScore ;
        scoreTextView.setText(text);

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
        // FIXME change color settings
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
    }
}
