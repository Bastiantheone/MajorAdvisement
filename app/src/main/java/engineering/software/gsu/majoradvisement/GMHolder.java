package engineering.software.gsu.majoradvisement;

/**
 * Created by Bastian Wieck on 4/13/2017.
 */

public class GMHolder {
    private int score, cs, ce, it, is, fun;
    public String username;
    private String password;
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

    public GM initializeGM(String password){
        if(this.password.equals(password)){
            GM.globalScore = score;
            GM.globalISScore = is;
            GM.globalCEScore = ce;
            GM.globalCsScore = cs;
            GM.globalITScore = it;
            GM.funValue = fun;
            return GM.initialize();
        }else{
            return null;
        }
    }
}
