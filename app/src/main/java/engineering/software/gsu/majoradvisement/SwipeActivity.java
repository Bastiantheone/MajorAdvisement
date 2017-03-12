package engineering.software.gsu.majoradvisement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SwipeActivity extends AppCompatActivity {
    private ImageView lowerImage, upperImage;
    private TextView leftText, centerText, rightText;
    private Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe);
        leftText = (TextView)findViewById(R.id.text_left);
        centerText = (TextView)findViewById(R.id.text_center);
        rightText = (TextView)findViewById(R.id.text_right);
        upperImage = (ImageView)findViewById(R.id.upper_image);
        upperImage.setContentDescription("Middle");
        lowerImage = (ImageView)findViewById(R.id.lower_image);
        lowerImage.setContentDescription("Middle");
        nextButton = (Button)findViewById(R.id.next_button);
        upperImage.setOnTouchListener(new OnSwipeListener(getBaseContext()));
        lowerImage.setOnTouchListener(new OnSwipeListener(getBaseContext()));

        //change this
        DatabaseConnect db = new DatabaseConnect();
        SwipeQuestion question = db.getSwipeQuestion();

        final ArrayList<Image> images = question.getImages();
        upperImage.setImageResource(images.get(0).getImgID());
        lowerImage.setImageResource(images.get(1).getImgID());
        leftText.setText(question.getTextLeft());
        rightText.setText(question.getTextRight());

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(upperImage.getContentDescription().equals("Right")){
                    /*
                    score+=images.get(0).getRightScore();
                    csRating+=images.get(0).getRightCSRating();
                    itRating+=images.get(0).getRightITRating();
                    isRating+=images.get(0).getRightISRating();
                    ceRating+=images.get(0).getRightCERating();*/
                }
                else if(upperImage.getContentDescription().equals("Left")){
                    /*
                    score+=images.get(0).getLeftScore();
                    csRating+=images.get(0).getLeftCSRating();
                    itRating+=images.get(0).getLeftITRating();
                    isRating+=images.get(0).getLeftISRating();
                    ceRating+=images.get(0).getLeftCERating();*/
                }
                if(lowerImage.getContentDescription().equals("Right")){
                    /*
                    score+=images.get(1).getRightScore();
                    csRating+=images.get(1).getRightCSRating();
                    itRating+=images.get(1).getRightITRating();
                    isRating+=images.get(1).getRightISRating();
                    ceRating+=images.get(1).getRightCERating();*/
                }
                else if(lowerImage.getContentDescription().equals("Left")){
                    /*
                    score+=images.get(1).getLeftScore();
                    csRating+=images.get(1).getLeftCSRating();
                    itRating+=images.get(1).getLeftITRating();
                    isRating+=images.get(1).getLeftISRating();
                    ceRating+=images.get(1).getLeftCERating();*/
                }

                //change this
                Intent intent = new Intent(getBaseContext(),RateActivity.class);
                startActivity(intent);
            }
        });
    }

}
