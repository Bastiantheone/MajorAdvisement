package engineering.software.gsu.majoradvisement;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bastian Wieck on 3/11/2017.
 */

public class SwipeQuestion extends Question{
    int FunValue = 0;
    private String textLeft;
    private String textRight;
    private List<Image> images;
    public SwipeQuestion(String textLeft, String textRight, int id, int fun){
        this.textLeft=textLeft;
        this.textRight=textRight;
        images = new ArrayList<>(2);
        super.id = id;
        super.FunValue = fun;
    }
    public void addImage(Image newImage){
        images.add(newImage);
    }
    public void addImages(List<Image> images){
        this.images = images;
    }
    public List<Image> getImages(){
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
