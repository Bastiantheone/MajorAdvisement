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

        SwipeQuestion question = (SwipeQuestion)GM.currentQuestion;

        final ArrayList<Image> images = question.getImages();
        upperImage.setImageResource(images.get(0).getImgID());
        lowerImage.setImageResource(images.get(1).getImgID());
        leftText.setText(question.getTextLeft());
        rightText.setText(question.getTextRight());

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(upperImage.getContentDescription().equals("Right")){

                    GM.globalScore+=images.get(0).getRightScore();
                    GM.globalCsScore+=images.get(0).getRightCSRating();
                    GM.globalITScore+=images.get(0).getRightITRating();
                    GM.globalISScore+=images.get(0).getRightISRating();
                    GM.globalCEScore+=images.get(0).getRightCERating();
                }
                else if(upperImage.getContentDescription().equals("Left")){
                    GM.globalScore+=images.get(0).getLeftScore();
                    GM.globalCsScore+=images.get(0).getLeftCSRating();
                    GM.globalITScore+=images.get(0).getLeftITRating();
                    GM.globalISScore+=images.get(0).getLeftISRating();
                    GM.globalCEScore+=images.get(0).getLeftCERating();
                }
                if(lowerImage.getContentDescription().equals("Right")){
                    GM.globalScore+=images.get(1).getRightScore();
                    GM.globalCsScore+=images.get(1).getRightCSRating();
                    GM.globalITScore+=images.get(1).getRightITRating();
                    GM.globalISScore+=images.get(1).getRightISRating();
                    GM.globalCEScore+=images.get(1).getRightCERating();
                }
                else if(lowerImage.getContentDescription().equals("Left")){
                    GM.globalScore+=images.get(1).getLeftScore();
                    GM.globalCsScore+=images.get(1).getLeftCSRating();
                    GM.globalITScore+=images.get(1).getLeftITRating();
                    GM.globalISScore+=images.get(1).getLeftISRating();
                    GM.globalCEScore+=images.get(1).getLeftCERating();
                }
                next();
            }
        });
    }

    public void next(){
        GM.initialize().nextQuestion().display(this);
    }
}
