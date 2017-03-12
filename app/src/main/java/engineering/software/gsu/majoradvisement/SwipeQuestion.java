package engineering.software.gsu.majoradvisement;

import java.util.ArrayList;

/**
 * Created by Bastian Wieck on 3/11/2017.
 */

public class SwipeQuestion {
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
}
