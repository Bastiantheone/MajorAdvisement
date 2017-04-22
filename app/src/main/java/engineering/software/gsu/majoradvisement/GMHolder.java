package engineering.software.gsu.majoradvisement;

import android.content.Context;

/**
 * Created by Bastian Wieck on 4/13/2017.
 */

public class GMHolder {
    public int score, cs, ce, it, is, fun;
    public String username;
    protected String password;
    public GMHolder(int score, int cs, int ce, int it, int is, int fun, String username, String password){
        this.score = score;
        this.cs = cs;
        this.ce = ce;
        this.it = it;
        this.is = is;
        this.fun = fun;
        this.username = username;
        this.password = password;
    }

    public GM initializeGM(String password, Context context){
        if(this.password.equals(password)){
            GM.globalScore = score;
            GM.globalISScore = is;
            GM.globalCEScore = ce;
            GM.globalCsScore = cs;
            GM.globalITScore = it;
            GM.funValue = fun;
            GM.username=username;
            GM.password=password;
            return GM.initialize(context);
        }else{
            return null;
        }
    }
}
