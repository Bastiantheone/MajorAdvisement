package engineering.software.gsu.majoradvisement;

import android.app.Application;

/**
 * Created by Kwame on 4/1/2017.
 */

public class MyApplication extends Application{
    //move this line to Login page
    GM GameMaster = GM.initialize();

    @Override
    public void onTerminate(){
        super.onTerminate();
        GM.inSession = false;
        //save GM to Database
    }

}
