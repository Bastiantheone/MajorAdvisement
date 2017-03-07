package engineering.software.gsu.majoradvisement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.TextView;

public class SwipeActivity extends AppCompatActivity {
    private ImageView softwareImage, hardwareImage;
    private TextView leftText, centerText, rightText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe);
        leftText = (TextView)findViewById(R.id.text_left);
        centerText = (TextView)findViewById(R.id.text_center);
        rightText = (TextView)findViewById(R.id.text_right);
        softwareImage = (ImageView)findViewById(R.id.software_image);
        hardwareImage = (ImageView)findViewById(R.id.hardware_image);
        softwareImage.setOnTouchListener(new OnSwipeListener(getBaseContext()));
        hardwareImage.setOnTouchListener(new OnSwipeListener(getBaseContext()));
    }

}
