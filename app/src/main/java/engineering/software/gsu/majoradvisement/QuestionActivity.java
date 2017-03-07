package engineering.software.gsu.majoradvisement;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuestionActivity extends AppCompatActivity  implements View.OnClickListener {

    Button a, b, c, d, nextButton;
    TextView Q;

    Button[] bArray = null;

    Question test = new Question("Does this work?");
    Answer a1 = new Answer ("Probably");
    Answer no = new Answer("no");
    Answer yes = new Answer("Yes");
    Answer maybe = new Answer("Maybe");



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        a = (Button)findViewById(R.id.ans1button);
        b = (Button)findViewById(R.id.ans2button);
        c = (Button)findViewById(R.id.ans3button);
        d = (Button)findViewById(R.id.ans4button);
        Q = (TextView)findViewById(R.id.questionText);
        nextButton = (Button)findViewById(R.id.next_button);

        bArray = new Button[] {a,b,c,d};

        test.add(a1);
        test.add(no);
        test.add(yes);
        test.add(maybe);

        setQuest(test);





        //Below are the methods to make the color swaps on the multiple choice question list: As well as set
        //the answers
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.setBackgroundColor(Color.CYAN);
                b.setBackgroundColor(Color.RED);
                c.setBackgroundColor(Color.RED);
                d.setBackgroundColor(Color.RED);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.setBackgroundColor(Color.RED);
                b.setBackgroundColor(Color.CYAN);
                c.setBackgroundColor(Color.RED);
                d.setBackgroundColor(Color.RED);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.setBackgroundColor(Color.RED);
                b.setBackgroundColor(Color.RED);
                c.setBackgroundColor(Color.CYAN);
                d.setBackgroundColor(Color.RED);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.setBackgroundColor(Color.RED);
                b.setBackgroundColor(Color.RED);
                c.setBackgroundColor(Color.RED);
                d.setBackgroundColor(Color.CYAN);
            }
        });
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(),SwipeActivity.class);
                startActivity(i);
            }
        });


    }

    public void onClick(View v){
        buttonClicked(v);
    }

    private void buttonClicked (View v){
        Button e = (Button)v;
        e.setBackgroundColor(Color.CYAN);
    }

    public void setQuest(Question focus){
        Q.setText(focus.text);
        a.setText(focus.answers.get(0).text);
        b.setText(focus.answers.get(1).text);
        c.setText(focus.answers.get(2).text);
        d.setText(focus.answers.get(3).text);

    }
}
