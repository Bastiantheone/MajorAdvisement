package engineering.software.gsu.majoradvisement;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.net.Uri;
import android.widget.TextView;

public class AboutScreenActivity extends AppCompatActivity {

    private Button back;
    private Button GSULink;
    private TextView abouttxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_screen);

        GSULink = (Button)(findViewById(R.id.GSUButton));
        abouttxt = (TextView) (findViewById(R.id.about_txt));

        abouttxt.setText("This is the Georgia Southern computing advisement app. Here you can take a questionnaire to see what major you might be best suited for. The questionnaire will try and ask you questions that you should be asking yourself when choosing a computing major. The results from the questionnaire are not final, and you can go into any major you want. The results will just show you what major you might like, based on how you answer the questionnaire. ");



        GSULink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uriUril = Uri.parse("http://www.georgiasouthern.edu/");
                Intent LB = new Intent(Intent.ACTION_VIEW, uriUril);
                startActivity(LB);

            }
        });
    }

}
