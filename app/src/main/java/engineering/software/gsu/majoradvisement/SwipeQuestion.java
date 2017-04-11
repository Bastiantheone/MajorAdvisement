package engineering.software.gsu.majoradvisement;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import java.util.ArrayList;

/**
 * Created by Bastian Wieck on 3/11/2017.
 */

public class SwipeQuestion extends Question{
    int FunValue = 0;
    private String textLeft;
    private String textRight;
    private ArrayList<Image> images;
    public SwipeQuestion(String textLeft, String textRight){
        this.textLeft=textLeft;
        this.textRight=textRight;
        images = new ArrayList<>(2);
    }
    public void addImage(Image newImage){
        images.add(newImage);
    }
    public ArrayList<Image> getImages(){
        return images;
    }
    public String getTextLeft(){
        return textLeft;
    }
    public String getTextRight(){
        return textRight;
    }

    @Override
    public void display(Activity activity){
        Intent intent = new Intent(activity,SwipeActivity.class);
        activity.startActivity(intent);
    }
}
