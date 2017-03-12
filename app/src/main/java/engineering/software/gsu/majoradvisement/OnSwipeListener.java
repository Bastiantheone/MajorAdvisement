package engineering.software.gsu.majoradvisement;

import android.content.Context;
import android.util.Log;
import android.view.GestureDetector;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * Created by Bastian Wieck on 3/7/2017.
 */

public class OnSwipeListener implements View.OnTouchListener {
    private final GestureDetector gestureDetector;
    private View view;

    @Override
    public boolean onTouch(View v, MotionEvent motionEvent){
        view = v;
        return gestureDetector.onTouchEvent(motionEvent);
    }

    public OnSwipeListener(Context context){
        gestureDetector = new GestureDetector(context, new GestureDetector.OnGestureListener() {
            private static final int SWIPE_TRESHOLD = 30;
            private static final int SWIPE_VELOCITY_TRESHOLD = 30;
            @Override
            public boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            @Override
            public void onShowPress(MotionEvent motionEvent) {

            }

            @Override
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                return true;
            }

            @Override
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
                return true;
            }

            @Override
            public void onLongPress(MotionEvent motionEvent) {

            }

            @Override
            public boolean onFling(MotionEvent motionEventStart, MotionEvent motionEventEnd, float velocityX, float velocityY) {
                boolean result = false;
                try {
                    float diffY = motionEventEnd.getY()-motionEventStart.getY();
                    float diffX = motionEventEnd.getX()-motionEventStart.getX();
                    if(Math.abs(diffX)>Math.abs(diffY)){//moves more to the side than up or down
                        if(Math.abs(diffX) > SWIPE_TRESHOLD && Math.abs(velocityX) > SWIPE_VELOCITY_TRESHOLD){//check minimum speed and distance swipped
                            if(diffX > 0){
                                onSwipeRight();
                            }
                            else{
                                onSwipeLeft();
                            }
                            result = true;
                        }
                    }
                }catch (Exception e){

                }
                return result;
            }
            public void onSwipeRight(){
                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(view.getLayoutParams());
                lp.gravity=Gravity.END;
                view.setLayoutParams(lp);
                view.setContentDescription("Right");
            }
            public void onSwipeLeft(){
                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(view.getLayoutParams());
                lp.gravity=Gravity.START;
                view.setLayoutParams(lp);
                view.setContentDescription("Left");
            }
        });
    }
}
